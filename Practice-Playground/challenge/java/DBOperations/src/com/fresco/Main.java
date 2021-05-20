package com.fresco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import static com.fresco.DbUtil.closeConnection;
import static com.fresco.DbUtil.getConnection;

public class Main {

    public static void main(String[] args) throws Exception {
        RunningScripts runs = new RunningScripts();
        runs.runDbScript();
        Statement statement = null;
        Connection conn;
        conn = DbUtil.getConnection();
        statement = conn.createStatement();
        ResultSet results = statement.executeQuery("SELECT id FROM CATEGORY WHERE type ='"+ "Vegetable"+"'");
        int id = results.getInt(1);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM CATEGORY");
        if (statement.execute("INSERT INTO PRODUCT (name, price, category_id) VALUES (" +"'"+"fruit"+"'" +"," +"'"+"2.03" +"'"+"," +"'"+id +"'"+ ")")
        ) {
            statement.close();
            closeConnection(conn);
           statement = conn.createStatement();
        }

        statement.close();
        closeConnection(conn);

    }
}
