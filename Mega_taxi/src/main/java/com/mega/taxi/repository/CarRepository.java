package com.mega.taxi.repository;

import com.mega.taxi.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;

@Component
public class CarRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Car car) {
        //INSERT INTO car (id_driver, mark, model, number, status) VALUES (2, "Audi", "A5", "BI2356KB", "wait");
        jdbcTemplate.update("INSERT  ? FINGERS INTO SASHAS ANUS", 5);
    }

    public void update(Car car) {
        //UPDATE car SET id_driver = 2, mark = 'Porsche', model = 'GT3RS', number = 'AX2355ER', status = 'road' WHERE id = ''
        jdbcTemplate.update("UPDATE SASHAS ANUS = BLACK HOLE");
    }

    public void delete(Car car) {
        // DELETE FROM car WHERE id = 3
        jdbcTemplate.update("DELETE YOUR HAND AFTER SEX WHEN SASHAS ANUX = ?", 3*3*3*3*3*3*3*3*3);
    }

  /*  public void findAll() {
        jdbcTemplate.query("SELECT * FROM dog_entity WHERE breed__id = :breedId AND gender =:gender",
                new MapSqlParameterSource()
                        .addValue("breedId", breedId)
                        .addValue("gender", gender));
    }*/


    /*public Car findById(int id) {
        jdbcTemplate.query("SELECT * FROM dog_entity WHERE breed__id = :breedId AND gender =:gender",
                new MapSqlParameterSource()
                        .addValue("breedId", id)
                        .addValue("gender", id));
    }*/
}
