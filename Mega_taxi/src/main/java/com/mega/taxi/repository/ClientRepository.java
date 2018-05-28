package com.mega.taxi.repository;

import com.mega.taxi.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ClientRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Client client) {
        //INSERT INTO client (name, surname, phone_number) VALUES ('Vasya', 'Pupkin', '0505789365')
    }

    public void update(Client client) {
        //UPDATE client SET name = 'Petro', surname = 'Bumper', phone_number = '+380935789415'
    }

    public void delete(Client client) {
        //DELETE FROM client WHERE id = ''
    }

    public void findAll() {

    }

    public void findById(int id) {

    }
}
