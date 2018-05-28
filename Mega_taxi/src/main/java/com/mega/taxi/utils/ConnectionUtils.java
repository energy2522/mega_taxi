package com.mega.taxi.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Slf4j
@Component
public class ConnectionUtils {
    @Autowired
    private DataSource dataSource;

    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
           log.warn("Error when opening connection", e);
        }

        return null;
    }

    public void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            log.warn("Error when close connection", e);
        }
    }


}
