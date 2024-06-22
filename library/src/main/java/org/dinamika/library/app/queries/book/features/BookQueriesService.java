package org.dinamika.library.app.queries.book.features;

import org.dinamika.library.app.queries.book.BookFilter;
import org.dinamika.library.app.queries.book.BookForm;
import org.dinamika.library.app.queries.book.BookPage;
import org.dinamika.library.app.queries.book.BookQueries;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.jooq.generated.public_.tables.records.BookRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.jooq.generated.public_.Tables.*;
import static org.jooq.impl.DSL.noCondition;
import static org.jooq.impl.DSL.selectCount;

@Service
@Transactional
public class BookQueriesService implements BookQueries {

    private final DSLContext context;

    @Autowired
    public BookQueriesService(DSLContext context) {
        this.context = context;
    }

    @Override
    public BookForm getBookForm(UUID bookId) {
        return context.select(BOOK)
                .from(BOOK)
                .where(BOOK.ID.eq(bookId))
                .fetchOptional()
                .map(Record1::component1)
                .map(this::toBookForm)
                .orElseThrow();
    }

    @Override
    public BookPage getBookPage(BookFilter filter) {
        List<BookForm> rows = context.select(BOOK)
                .from(BOOK)
                .where(conditionBy(filter))
                .orderBy(BOOK.TITLE, BOOK.AUTHOR, BOOK.ISBN)
                .offset(filter.pageNumber() * filter.pageSize())
                .limit(filter.pageSize())
                .fetch()
                .map(it -> toBookForm(it.component1()));

        return new BookPage(rows, filter.pageNumber(), filter.pageSize(), getTotalCount(filter));
    }

    private Integer getTotalCount(BookFilter filter) {
        return context.fetchValue(selectCount().from(BOOK).where(conditionBy(filter)));
    }

    private Condition conditionBy(BookFilter filter) {
        List<Condition> conditions = new ArrayList<>();

        if (filter.search() != null) {
            String substring = "%" + filter.search() + "%";
            conditions.add(
                    BOOK.TITLE.likeIgnoreCase(substring)
                            .or(BOOK.AUTHOR.likeIgnoreCase(substring))
                            .or(BOOK.ISBN.likeIgnoreCase(substring))
            );
        }

        return conditions.stream().reduce(noCondition(), Condition::and);
    }

    private BookForm toBookForm(BookRecord bookRecord) {
        return new BookForm(
                bookRecord.getId(),
                bookRecord.getTitle(),
                bookRecord.getAuthor(),
                bookRecord.getIsbn()
        );
    }
}
