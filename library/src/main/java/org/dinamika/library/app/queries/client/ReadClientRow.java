package org.dinamika.library.app.queries.client;

import org.dinamika.library.app.queries.book.BookForm;

import java.util.List;

public record ReadClientRow(ClientForm client, List<BookForm> books) {
}
