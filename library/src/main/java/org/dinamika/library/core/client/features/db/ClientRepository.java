package org.dinamika.library.core.client.features.db;

import org.dinamika.library.core.client.features.doman.ClientDomain;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.jooq.generated.public_.tables.records.ClientRecord;

import java.time.ZoneOffset;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import static org.jooq.generated.public_.Tables.CLIENT;
import static org.jooq.impl.DSL.select;

@Repository
public class ClientRepository {

    private final DSLContext context;

    @Autowired
    public ClientRepository(DSLContext context) {
        this.context = context;
    }

    public void addClient(ClientDomain client) {
        ClientRecord dbModel = toClientRecord(client);
        context.insertInto(CLIENT).set(dbModel).onDuplicateKeyUpdate().set(dbModel).execute();
    }

    public void removeClientById(UUID clientId) {
        context.deleteFrom(CLIENT).where(CLIENT.ID.eq(clientId)).execute();
    }

    public Optional<ClientDomain> findClientById(UUID clientId) {
        return context.fetchOptional(select(CLIENT).from(CLIENT).where(CLIENT.ID.eq(clientId)))
                .map(Record1::component1)
                .map(this::toClient);
    }

    private ClientRecord toClientRecord(ClientDomain client) {
        ClientRecord clientRecord = new ClientRecord();
        clientRecord.setId(client.id());
        clientRecord.setSurname(client.surname());
        clientRecord.setName(client.name());
        clientRecord.setPatronymic(client.patronymic());
        clientRecord.setDateOfBirthday(client.dateOfBirthday().toInstant().atZone(ZoneOffset.UTC).toLocalDate());

        return clientRecord;
    }

    private ClientDomain toClient(ClientRecord clientRecord) {
        return new ClientDomain(
                clientRecord.getId(),
                clientRecord.getSurname(),
                clientRecord.getName(),
                clientRecord.getPatronymic(),
                Date.from(clientRecord.getDateOfBirthday().atStartOfDay().toInstant(ZoneOffset.UTC))
        );
    }
}
