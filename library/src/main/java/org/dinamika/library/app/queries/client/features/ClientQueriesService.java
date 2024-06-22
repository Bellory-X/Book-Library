package org.dinamika.library.app.queries.client.features;

import org.dinamika.library.app.queries.book.BookForm;
import org.dinamika.library.app.queries.client.*;
import org.dinamika.library.app.web.BookRequest;
import org.dinamika.library.app.web.ClientRequest;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.jooq.generated.public_.tables.records.ClientRecord;
import org.jooq.generated.public_.tables.records.BookRecord;

import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static org.jooq.generated.public_.Tables.*;
import static org.jooq.impl.DSL.*;

@Service
@Transactional
public class ClientQueriesService implements ClientQueries {

    private final DSLContext context;

    @Autowired
    public ClientQueriesService(DSLContext context) {
        this.context = context;
    }

    @Override
    public ClientForm getClientForm(UUID clientId) {
        return context.select(CLIENT)
                .from(CLIENT)
                .where(CLIENT.ID.eq(clientId))
                .fetchOptional()
                .map(Record1::component1)
                .map(this::toClientForm)
                .orElseThrow();
    }

    @Override
    public ClientPage getClientPage(ClientFilter filter) {
        List<ClientForm> rows = context.select(CLIENT)
                .from(CLIENT)
                .where(conditionBy(filter))
                .orderBy(CLIENT.SURNAME, CLIENT.NAME, CLIENT.PATRONYMIC, CLIENT.DATE_OF_BIRTHDAY)
                .offset(filter.pageNumber() * filter.pageSize())
                .limit(filter.pageSize())
                .fetch()
                .map(it -> toClientForm(it.component1()));

        return new ClientPage(rows, filter.pageNumber(), filter.pageSize(), getTotalCount(filter));
    }

    @Override
    public ReadClientPage getReadClientPage(ReadClientFilter filter) {
        List<ReadClientRow> rows = context.select(CLIENT, multisetAgg(BOOK))
                .from(CLIENT)
                .innerJoin(CLIENT_BOOK)
                .on(CLIENT_BOOK.CLIENT_ID.eq(CLIENT.ID))
                .leftJoin(BOOK)
                .on(BOOK.ID.eq(CLIENT_BOOK.BOOK_ID))
                .where(conditionBy(filter))
                .groupBy(CLIENT, CLIENT_BOOK)
                .orderBy(CLIENT.SURNAME, CLIENT.NAME, CLIENT.PATRONYMIC, CLIENT.DATE_OF_BIRTHDAY)
                .offset(filter.pageNumber() * filter.pageSize())
                .limit(filter.pageSize())
                .fetch()
                .map(this::toReadClientRow);

        return new ReadClientPage(rows, filter.pageNumber(), filter.pageSize(), getTotalCount(filter));
    }

    private Integer getTotalCount(ClientFilter filter) {
        return context.fetchValue(selectCount().from(CLIENT).where(conditionBy(filter)));
    }

    private Integer getTotalCount(ReadClientFilter filter) {
        return context.fetchValue(
                selectCount().from(CLIENT)
                        .innerJoin(CLIENT_BOOK)
                        .on(CLIENT_BOOK.CLIENT_ID.eq(CLIENT.ID))
                        .leftJoin(BOOK)
                        .on(BOOK.ID.eq(CLIENT_BOOK.BOOK_ID))
                        .where(conditionBy(filter))
                        .groupBy(CLIENT, CLIENT_BOOK)
        );
    }

    private Condition conditionBy(ClientFilter filter) {
        List<Condition> conditions = new ArrayList<>();

        if (filter.search() != null) {
            String substring = "%" + filter.search() + "%";
            conditions.add(
                    CLIENT.SURNAME.likeIgnoreCase(substring)
                            .or(CLIENT.NAME.likeIgnoreCase(substring))
                            .or(CLIENT.PATRONYMIC.likeIgnoreCase(substring))
                            .or(CLIENT.DATE_OF_BIRTHDAY.likeIgnoreCase(substring))
            );
        }

        return conditions.stream().reduce(noCondition(), Condition::and);
    }

    private Condition conditionBy(ReadClientFilter filter) {
        List<Condition> conditions = new ArrayList<>();

        if (filter.search() != null) {
            String substring = "%" + filter.search() + "%";
            conditions.add(
                    CLIENT.SURNAME.likeIgnoreCase(substring)
                            .or(CLIENT.NAME.likeIgnoreCase(substring))
                            .or(CLIENT.PATRONYMIC.likeIgnoreCase(substring))
                            .or(CLIENT.DATE_OF_BIRTHDAY.likeIgnoreCase(substring))
                            .or(BOOK.TITLE.likeIgnoreCase(substring))
                            .or(BOOK.AUTHOR.likeIgnoreCase(substring))
                            .or(BOOK.ISBN.likeIgnoreCase(substring))
            );
        }

        return conditions.stream().reduce(noCondition(), Condition::and);
    }

    private ClientForm toClientForm(ClientRecord clientRecord) {
        return new ClientForm(
                clientRecord.getId(),
                clientRecord.getSurname(),
                clientRecord.getName(),
                clientRecord.getPatronymic(),
                Date.from(clientRecord.getDateOfBirthday().atStartOfDay().toInstant(ZoneOffset.UTC))
        );
    }

    private BookForm toBookForm(BookRecord bookRecord) {
        return new BookForm(
                bookRecord.getId(),
                bookRecord.getTitle(),
                bookRecord.getAuthor(),
                bookRecord.getIsbn()
        );
    }

    private ReadClientRow toReadClientRow(Record2<ClientRecord, Result<Record1<BookRecord>>> record) {
        return new ReadClientRow(toClientForm(record.component1()), record.component2().map(it -> toBookForm(it.component1())));
    }
}
