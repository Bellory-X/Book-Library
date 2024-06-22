package org.dinamika.library.app.queries.client;

import java.util.Date;
import java.util.UUID;

public record ClientForm(UUID id, String surname, String name, String patronymic, Date dateOfBirthday) {
}
