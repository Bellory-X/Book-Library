package org.dinamika.library.app.web;

import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import org.dinamika.library.app.queries.client.*;
import org.dinamika.library.core.client.ClientCommands;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(CommonUrl.API)
@Valid
public class ClientController {

    private final ClientCommands commands;
    private final ClientQueries queries;

    @Autowired
    public ClientController(ClientCommands commands, ClientQueries queries) {
        this.commands = commands;
        this.queries = queries;
    }

    @PostMapping(CommonUrl.CLIENT)
    public void createClient(@RequestBody ClientRequest request) {
        commands.createClient(request);
    }

    @PutMapping(CommonUrl.CLIENT_ID)
    public void updateClient(@PathVariable UUID id, @RequestBody ClientRequest request) {
        commands.updateClient(id, request);
    }

    @DeleteMapping(CommonUrl.CLIENT_ID)
    public void deleteClient(@PathVariable UUID id) {
        commands.deleteClient(id);
    }

    @GetMapping(CommonUrl.CLIENT_ID)
    public ClientForm getClient(@PathVariable UUID id) {
        return queries.getClientForm(id);
    }

    @GetMapping(CommonUrl.CLIENT_PAGE)
    public ClientPage getClientPage(
            @RequestParam(name = "p-num") @PositiveOrZero Integer pageNumber,
            @RequestParam(name = "p-size") @Positive Integer pageSize,
            @RequestParam(name = "search", required = false) @Nullable String search
    ) {
        return queries.getClientPage(new ClientFilter(pageNumber, pageSize, search));
    }

    @GetMapping(CommonUrl.READ_CLIENT_PAGE)
    public ReadClientPage getReadClientPage(
            @RequestParam(name = "p-num") @PositiveOrZero Integer pageNumber,
            @RequestParam(name = "p-size") @Positive Integer pageSize,
            @RequestParam(name = "search", required = false) @Nullable String search
    ) {
        return queries.getReadClientPage(new ReadClientFilter(pageNumber, pageSize, search));
    }
}
