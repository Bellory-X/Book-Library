package org.dinamika.library.core.client.features;

import org.dinamika.library.app.web.ClientRequest;
import org.dinamika.library.core.client.ClientCommands;
import org.dinamika.library.core.client.features.db.ClientRepository;
import org.dinamika.library.core.client.features.doman.ClientDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class ClientCommandsService implements ClientCommands {

    private final ClientRepository repository;

    @Autowired
    public ClientCommandsService(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createClient(ClientRequest request) {
        ClientDomain client = ClientDomain.create(request);
        repository.addClient(client);
    }

    @Override
    public void updateClient(UUID clientId, ClientRequest request) {
        ClientDomain client = repository.findClientById(clientId).orElseThrow();
        ClientDomain updatedClient = client.update(request);
        repository.addClient(updatedClient);
    }

    @Override
    public void deleteClient(UUID clientId) {
        repository.removeClientById(clientId);
    }
}
