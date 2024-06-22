package org.dinamika.library.core.book;

import org.dinamika.library.app.web.BookRequest;

import java.util.UUID;

public interface BookCommands {

    void createBook(BookRequest request);

    void updateBook(UUID bookId, BookRequest request);

    void deleteBook(UUID bookId);
}
