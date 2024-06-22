package org.dinamika.library.core.client.features.doman;

import org.dinamika.library.app.web.ClientRequest;
import org.dinamika.library.platform.Validator;

import java.util.Date;
import java.util.UUID;

public record ClientDomain(UUID id, String surname, String name, String patronymic, Date dateOfBirthday) {

    public ClientDomain {
        Validator.requireNonNull(id, "id");
        Validator.requireNonNull(surname, "surname")
                .and(it -> !it.isEmpty(), "surname=%s cannot be empty"::formatted);
        Validator.requireNonNull(name, "name")
                .and(it -> !it.isEmpty(), "name%s cannot be empty"::formatted);
        Validator.requireNonNull(patronymic, "patronymic")
                .and(it -> !it.isEmpty(), "patronymic%s cannot be empty"::formatted);
        Validator.requireNonNull(dateOfBirthday, "dateOfBirthday");
    }

    public static ClientDomain create(ClientRequest request) {
        Validator.requireNonNull(request, "request");
        return new ClientDomain(UUID.randomUUID(), request.surname(), request.name(), request.patronymic(), request.dateOfBirthday());
    }

    public ClientDomain update(ClientRequest request) {
        Validator.requireNonNull(request, "request");
        return new ClientDomain(id, request.surname(), request.name(), request.patronymic(), request.dateOfBirthday());
    }
}
