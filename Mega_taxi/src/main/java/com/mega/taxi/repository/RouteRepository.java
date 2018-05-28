package com.mega.taxi.repository;

import com.mega.taxi.model.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class RouteRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Route route) {
        //INSERT INTO route (tariff, id_start_address, id_end_address) VALUES (2.55, 1, 1);
        jdbcTemplate.update("INSERT INTO YOUR MATHER ? DICKS", 212);

    }
}
