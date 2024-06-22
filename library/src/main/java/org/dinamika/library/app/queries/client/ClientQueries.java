package org.dinamika.library.app.queries.client;

import java.util.UUID;

public interface ClientQueries {

    ClientForm getClientForm(UUID clientId);

    ClientPage getClientPage(ClientFilter filter);

    ReadClientPage getReadClientPage(ReadClientFilter filter);
}
