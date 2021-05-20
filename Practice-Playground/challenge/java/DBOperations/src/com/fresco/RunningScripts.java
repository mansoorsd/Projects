package com.fresco;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class RunningScripts {
    public void runDbScript() throws Exception {
        Connection conn;
        conn = DbUtil.getConnection();
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS CATEGORY " +
                    " (id INTEGER PRIMARY KEY AUTOINCREMENT, type VARCHAR(25))");
            statement.execute("CREATE TABLE IF NOT EXISTS PRODUCT " +
                    " (id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(20), price FLOAT, category_id INT)");
            statement.execute("CREATE TABLE IF NOT EXISTS ORDERS " +
                    " (id INTEGER PRIMARY KEY AUTOINCREMENT,product_id INT, order_date DATE)");
            statement.close();
        DbUtil.closeConnection(conn);

    }
}
