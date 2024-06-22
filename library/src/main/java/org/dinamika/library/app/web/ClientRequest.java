package org.dinamika.library.app.web;

import java.util.Date;

public record ClientRequest(String surname, String name, String patronymic, Date dateOfBirthday) {
}
