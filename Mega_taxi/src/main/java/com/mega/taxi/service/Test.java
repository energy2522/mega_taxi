package com.mega.taxi.service;

import com.mega.taxi.model.Client;
import com.mega.taxi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(value = "/clients", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

}
