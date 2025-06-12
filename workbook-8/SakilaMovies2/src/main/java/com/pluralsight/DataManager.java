package com.pluralsight;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public List <Actor> searchActorsByName(String lastName){
        List<Actor> actors = new ArrayList<>();

        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT actor_id, first_name, last_name FROM actor WHERE last_name = ?")){
                    statement.setString(1, lastName);

                    try(ResultSet results = statement.executeQuery()){
                        while (results.next()){
                            int actorId = results.getInt("actor_id");
                            String firstName = results.getString();
                            String lastName = results.getString();
                        }
                    }
        }
    }
}