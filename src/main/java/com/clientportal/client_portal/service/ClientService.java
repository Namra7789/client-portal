package com.clientportal.client_portal.service;

import com.clientportal.client_portal.model.Client;
import com.clientportal.client_portal.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> getAllClients() {
        return repository.findAll();
    }

    public Client getClientById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Client saveClient(Client client) {
        return repository.save(client);
    }

    public void deleteClient(String id) {
        repository.deleteById(id);
    }
}
