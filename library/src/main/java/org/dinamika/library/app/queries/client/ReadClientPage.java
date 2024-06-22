package org.dinamika.library.app.queries.client;

import org.dinamika.library.platform.TablePage;

import java.util.List;

public class ReadClientPage extends TablePage<ReadClientRow> {
    public ReadClientPage(List<ReadClientRow> rows, Integer pageNumber, Integer pageSize, Integer pageCount) {
        super(rows, pageNumber, pageSize, pageCount);
    }
}
