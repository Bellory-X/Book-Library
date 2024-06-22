package org.dinamika.library.app.web;

public interface CommonUrl {

    String API = "/api";

    String BOOK = "/book";
    String BOOK_ID = BOOK + "/{id}";
    String BOOK_PAGE = BOOK + "/page";

    String CLIENT = "/client";
    String CLIENT_ID = CLIENT + "/{id}";
    String CLIENT_PAGE = CLIENT + "/page";

    String READ_CLIENT_PAGE = CLIENT_PAGE + "/read";
}
