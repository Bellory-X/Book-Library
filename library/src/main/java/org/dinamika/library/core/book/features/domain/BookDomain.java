package org.dinamika.library.core.book.features.domain;

import org.dinamika.library.app.web.BookRequest;
import org.dinamika.library.platform.Validator;

import java.util.UUID;

public record BookDomain(UUID id, String title, String author, String isbn) {

    private static final String regexIsbn = "^(?:ISBN(?:-1[03])?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})" +
            "[- 0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[- ]){4})" +
            "[- 0-9]{17}$)(?:97[89][- ]?)?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";


    public BookDomain {
        Validator.requireNonNull(id, "id");
        Validator.requireNonNull(title, "title")
                .and(it -> !it.isEmpty(), "title%s cannot be empty"::formatted);
        Validator.requireNonNull(author, "author")
                .and(it -> !it.isEmpty(), "author=%s cannot be empty"::formatted);
        Validator.requireNonNull(isbn, "isbn")
                .and(it -> !it.isEmpty(), "isbn=%s cannot be isbn by standard"::formatted);
    }

    public static BookDomain create(BookRequest request) {
        Validator.requireNonNull(request, "request");
        return new BookDomain(UUID.randomUUID(), request.title(), request.author(), request.isbn());
    }

    public BookDomain update(BookRequest request) {
        Validator.requireNonNull(request, "request");
        return new BookDomain(id, request.title(), request.author(), request.isbn());
    }
}
