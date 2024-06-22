package org.dinamika.library.app.queries.book;

import java.util.UUID;

public record BookForm(UUID id, String title, String author, String isbn) {
}
