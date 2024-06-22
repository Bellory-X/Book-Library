package org.dinamika.library.core.client;

import org.dinamika.library.app.web.ClientRequest;

import java.util.UUID;

public interface ClientCommands {

    void createClient(ClientRequest request);

    void updateClient(UUID clientId, ClientRequest request);

    void deleteClient(UUID clientId);
}
