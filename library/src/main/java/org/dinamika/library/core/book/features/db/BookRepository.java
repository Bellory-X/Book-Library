package org.dinamika.library.core.book.features.db;

import org.dinamika.library.core.book.features.domain.BookDomain;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.jooq.generated.public_.tables.records.BookRecord;

import java.util.Optional;
import java.util.UUID;

import static org.jooq.generated.public_.Tables.BOOK;
import static org.jooq.impl.DSL.select;

@Repository
public class BookRepository {

    private final DSLContext context;

    @Autowired
    public BookRepository(DSLContext context) {
        this.context = context;
    }

    public void addBook(BookDomain book) {
        BookRecord dbModel = toBookRecord(book);
        context.insertInto(BOOK).set(dbModel).onDuplicateKeyUpdate().set(dbModel).execute();
    }

    public void removeBookById(UUID bookId) {
        context.deleteFrom(BOOK).where(BOOK.ID.eq(bookId)).execute();
    }

    public Optional<BookDomain> findBookById(UUID bookId) {
        return context.fetchOptional(select(BOOK).from(BOOK).where(BOOK.ID.eq(bookId)))
                .map(Record1::component1)
                .map(this::toBook);
    }

    private BookRecord toBookRecord(BookDomain book) {
        BookRecord bookRecord = new BookRecord();
        bookRecord.setId(book.id());
        bookRecord.setTitle(book.title());
        bookRecord.setAuthor(book.author());
        bookRecord.setIsbn(book.isbn());

        return bookRecord;
    }

    private BookDomain toBook(BookRecord bookRecord) {
        return new BookDomain(
                bookRecord.getId(),
                bookRecord.getTitle(),
                bookRecord.getAuthor(),
                bookRecord.getIsbn()
        );
    }
}
