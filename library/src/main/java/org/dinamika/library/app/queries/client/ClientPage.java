package org.dinamika.library.app.queries.client;

import org.dinamika.library.platform.TablePage;

import java.util.List;

public class ClientPage extends TablePage<ClientForm> {
    public ClientPage(List<ClientForm> rows, Integer pageNumber, Integer pageSize, Integer pageCount) {
        super(rows, pageNumber, pageSize, pageCount);
    }
}
