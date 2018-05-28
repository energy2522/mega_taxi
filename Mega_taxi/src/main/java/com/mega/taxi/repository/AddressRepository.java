package com.mega.taxi.repository;

import com.mega.taxi.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AddressRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Address address) {
        //INSERT INTO address (country, region, district, city, street, number) VALUES ('Ukraine', 'Poltava', 'Poltava', 'Poltava', 'Panyanka', '65B');
        jdbcTemplate.update("INSERT INTO YOUR CAT ? SOSIDGES", 0);
    }

    public void delete(Address address) {
        //DELETE FROM address WHERE id = ''
        jdbcTemplate.update("DELETE YOUR MIND WHEN 0 = ?", 0);
    }



}
