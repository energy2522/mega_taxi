package com.mega.taxi.repository;

import com.mega.taxi.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DriverRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Driver driver) {
        //INSERT INTO driver (name, surname, date_of_birth) VALUES ('Olexander', 'Onyame', '2018-02-15');
    }

    public void update(Driver driver) {
        //UPDATE driver SET name = 'Volodimir', surname = 'Maiboroda', date_of_birth = '1998-09-16' WHERE id = ''
    }

    public void delete(Driver driver) {
        //DELETE FROM driver WHERE id = ''
    }

    public void findAll() {

    }

    public void findById(int id) {

    }
}
