package com.fresco;

import java.sql.*;

public class DbUtil {
    private static String DB_URL ="jdbc:sqlite:F:\\database\\grocery.db";
//    private static String USERNAME = "root";
//    private static String PASSWORD = "rootpw";
    public static Connection getConnection() {
        Connection con = null;
        System.out.println(DB_URL);
        try {
            con= DriverManager.getConnection(DB_URL);
//                    USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println(e);

        }
        return con;
    }

    public static void closeConnection(Connection cons) {
        try {
            cons.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}