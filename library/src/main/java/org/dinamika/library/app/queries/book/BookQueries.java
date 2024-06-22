package org.dinamika.library.app.queries.book;

import java.util.UUID;

public interface BookQueries {

    BookForm getBookForm(UUID bookId);

    BookPage getBookPage(BookFilter filter);
}
