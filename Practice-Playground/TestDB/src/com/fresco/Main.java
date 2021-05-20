package com.fresco;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING ="jdbc:sqlite:F:\\database\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {



//	try(    Connection conn = DriverManager.getConnection("jdbc:sqlite:F:\\database\\testjava.db");
//            Statement statement = conn.createStatement();){
        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS " +TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" +
                    ")");
            insertContact(statement,"Tim", 6545678, "tim@email.com");
            insertContact(statement,"Joe", 45632, "joe@anywhere.com");
            insertContact(statement,"Jane", 4829484, "jane@somewhere.com");
            insertContact(statement,"Fido", 9038, "dog@email.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=5566789" +
                    " WHERE " + COLUMN_NAME + "='Jane'");

            statement.execute("DELETE FROM " +TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + "='Joe'");



//            statement.execute("INSERT INTO contacts (name, phone, email)"+
//            "VALUES('basha', '1214', 'basha@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)"+
//                    "VALUES('Syed', '87646', 'syed@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)"+
//                    "VALUES('tim', '87884515844', 'tim@email.com')");
           // statement.execute("UPDATE contacts SET phone = 84656515 WHERE name = 'mansoor'");

//            statement.execute("DELETE FROM contacts WHERE name = 'basha'");
//            statement.execute("DELETE FROM contacts WHERE name = 'syed'");
//            statement.execute("DELETE FROM contacts WHERE name = 'tim'");
//            statement.execute("DELETE FROM contacts WHERE name = 'Syed'");
//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
            while ((results.next())){
                System.out.println(results.getString("name") + " " +
                                   results.getString("phone")+ " " +
                                    results.getString("email")) ;
            }
            results.close();




            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong" + e.getMessage());
        }
    }
    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }


}
