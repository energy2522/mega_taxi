package com.mega.taxi.repository;

import com.mega.taxi.model.Client;
import com.mega.taxi.utils.ConnectionUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class ClientRepository {

    @Autowired
    private ConnectionUtils connectionUtils;

    public void create(Client client) {
        //INSERT INTO client (name, surname, phone_number) VALUES ('Vasya', 'Pupkin', '0505789365')
    }

    public void update(Client client) {
        //UPDATE client SET name = 'Petro', surname = 'Bumper', phone_number = '+380935789415'
    }

    public void delete(Client client) {
        //DELETE FROM client WHERE id = ''
    }
    public List<Client> findAll() {
        Connection connection = connectionUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, name, surname, phone_number FROM client");
            
            return getList(resultSet);
        } catch (SQLException e) {
            log.error("Error in findAll", e);

            return null;
        }
    }

    public void findById(int id) {

    }

    private List<Client> getList(ResultSet resultSet) throws SQLException {
        List<Client> list = new ArrayList<>();

        while (resultSet.next()) {
            Client client = new Client();
            client.setId(resultSet.getInt("id"));
            client.setName(resultSet.getString("name"));
            client.setSurname(resultSet.getString("surname"));
            client.setPhoneNumber(resultSet.getString("phone_number"));

            list.add(client);
        }

        return list;
    }
}
