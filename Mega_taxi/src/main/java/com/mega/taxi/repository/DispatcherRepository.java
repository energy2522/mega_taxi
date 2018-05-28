package com.mega.taxi.repository;


import com.mega.taxi.model.Dispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DispatcherRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Dispatcher dispatcher) {
        //INSERT INTO dispatcher (name, surname, date_of_birth) VALUES ('Masha', 'Petrova', '1936-09-20');
    }

    public void update(Dispatcher dispatcher) {
        //UPDATE dispatcher SET name = 'Anya', surname = 'Vercova', date_of_birth = '2000-12-25'
    }

    public void delete(Dispatcher dispatcher) {
        //DELETE FROM dispatcher WHERE id = ''
    }

    public void findAll() {

    }

    public void findById(int id) {

    }
}
