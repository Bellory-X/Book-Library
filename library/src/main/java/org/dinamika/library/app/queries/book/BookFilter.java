package org.dinamika.library.app.queries.book;

public record BookFilter(Integer pageNumber, Integer pageSize, String search) {
}
