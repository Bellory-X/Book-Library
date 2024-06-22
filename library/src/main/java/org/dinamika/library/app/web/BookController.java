package org.dinamika.library.app.web;

import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import org.dinamika.library.app.queries.book.BookFilter;
import org.dinamika.library.app.queries.book.BookForm;
import org.dinamika.library.app.queries.book.BookPage;
import org.dinamika.library.app.queries.book.BookQueries;
import org.dinamika.library.core.book.BookCommands;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(CommonUrl.API)
@Valid
public class BookController {

    private final BookCommands commands;
    private final BookQueries queries;

    @Autowired
    public BookController(BookCommands commands, BookQueries queries) {
        this.commands = commands;
        this.queries = queries;
    }

    @PostMapping(CommonUrl.BOOK)
    public void createBook(@RequestBody BookRequest request) {
        commands.createBook(request);
    }

    @PutMapping(CommonUrl.BOOK_ID)
    public void updateBook(@PathVariable UUID id, @RequestBody BookRequest request) {
        commands.updateBook(id, request);
    }

    @DeleteMapping(CommonUrl.BOOK_ID)
    public void deleteBook(@PathVariable UUID id) {
        commands.deleteBook(id);
    }

    @GetMapping(CommonUrl.BOOK_ID)
    public BookForm getBook(@PathVariable UUID id) {
        return queries.getBookForm(id);
    }

    @GetMapping(CommonUrl.BOOK_PAGE)
    public BookPage getBookPage(
            @RequestParam(name = "p-num") @PositiveOrZero Integer pageNumber,
            @RequestParam(name = "p-size") @Positive Integer pageSize,
            @RequestParam(name = "search", required = false) @Nullable String search
    ) {
        return queries.getBookPage(new BookFilter(pageNumber, pageSize, search));
    }
}
