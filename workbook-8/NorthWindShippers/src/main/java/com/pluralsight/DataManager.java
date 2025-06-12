package com.pluralsight;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int insertShipper(String shipperName, String phone) {

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO shippers (CompanyName, Phone) VALUES (?, ?)")) {

            statement.setString(1, shipperName);
        statement.setString(2, phone);


            statement.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
            }
