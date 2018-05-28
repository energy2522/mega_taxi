package com.mega.taxi.repository;

import com.mega.taxi.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Order order) {
        //INSERT INTO `order` (id_client, id_dispatcher, id_car, id_route, sum, order_date, status) VALUES (1, 1, 2, 1, 40, '2018-09-18', 'process');
    }

    public void update(Order order) {
        //UPDATE `order` SET id_client = 1, id_dispatcher = 1, id_car = 1, id_route = 1, `sum` = 400, order_date = '2017-06-10', status = 'done' WHERE id = 1
    }

    public void delete(Order order) {
        //DELETE FROM `order` WHERE id = 1
    }

    public void findAll() {

    }

    public void findById(int id) {

    }
}
