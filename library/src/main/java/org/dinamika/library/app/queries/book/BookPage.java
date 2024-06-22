package org.dinamika.library.app.queries.book;

import org.dinamika.library.platform.TablePage;

import java.util.List;

public class BookPage extends TablePage<BookForm> {
    public BookPage(List<BookForm> rows, Integer pageNumber, Integer pageSize, Integer pageCount) {
        super(rows, pageNumber, pageSize, pageCount);
    }
}
