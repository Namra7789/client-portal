package com.clientportal.client_portal.repository;

import com.clientportal.client_portal.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
}