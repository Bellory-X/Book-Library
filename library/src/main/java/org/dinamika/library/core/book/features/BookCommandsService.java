package org.dinamika.library.core.book.features;

import org.dinamika.library.app.web.BookRequest;
import org.dinamika.library.core.book.BookCommands;
import org.dinamika.library.core.book.features.db.BookRepository;
import org.dinamika.library.core.book.features.domain.BookDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class BookCommandsService implements BookCommands {

    private final BookRepository repository;

    @Autowired
    public BookCommandsService(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createBook(BookRequest request) {
        BookDomain book = BookDomain.create(request);
        repository.addBook(book);
    }

    @Override
    public void updateBook(UUID bookId, BookRequest request) {
        BookDomain book = repository.findBookById(bookId).orElseThrow();
        repository.addBook(book.update(request));
    }

    @Override
    public void deleteBook(UUID bookId) {
        repository.removeBookById(bookId);
    }
}
