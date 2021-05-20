package com.fresco;


import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static com.fresco.DbUtil.*;


public class DbOperations {


    public boolean insertCategory(String type) throws SQLException {
        Connection conn = getConnection();
        Statement statement = conn.createStatement();

        try {
            if (statement.execute("INSERT INTO CATEGORY (type) VALUES (" + "'" + type + "'" + ")")
            ) {

                return true;
            }
        } catch (Exception e) {

        } finally {

            try {
                conn.close();
                statement.close();
            } catch (Exception e) {
            }


        }
        return false;
    }

    public ArrayList getCategoryById(int id) throws SQLException {
        Connection conn = getConnection();
        Statement statement = conn.createStatement();

        ResultSet results = statement.executeQuery("SELECT * FROM CATEGORY WHERE id ="+id);

        ArrayList category = new ArrayList();
        while (results.next()) {

          category.add(results.getInt(1));
          category.add(results.getString(2));
        }
        System.out.println(category);

        return  category;
    }

    public ResultSet getAllCategory() throws SQLException {
        Connection conn = getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = null;

        try {

            resultSet = statement.executeQuery("SELECT * FROM CATEGORY");
            return resultSet;
        } catch (Exception e) {
        }
        return  resultSet;
    }
    public boolean insertProduct(String name, float price, String type) throws SQLException {
        int id =5;
        Connection conn = getConnection();
        Statement statement = conn.createStatement();

        if (statement.execute("INSERT INTO product (name, price, category_id) VALUES (" +"'"+name+"'" +"," +price +"," +id +")")
        ) {
            statement.close();
            closeConnection(conn);

            return true;

        }
        statement.close();
        closeConnection(conn);

        return false;

    }
    public ArrayList getProductById(int id) throws SQLException {
        Connection conn = getConnection();
        Statement statement = conn.createStatement();
        ResultSet results = statement.executeQuery("SELECT * FROM PRODUCT WHERE id ="+id);

        ArrayList product = new ArrayList();
        try {
            while (results.next()) {
                product.add(results.getInt(1));
                product.add(results.getString(2));
                product.add(results.getFloat(3));
                product.add(results.getInt(4));
            }
            return product;
        }catch (SQLException e){

        }
        finally {
            try{
                statement.close();
                conn.close();
            }catch (SQLException e){

            }
        }


        return  product;
    }
    public ResultSet getAllProduct() throws SQLException {
        Connection conn = getConnection();
        Statement statement = conn.createStatement();
        ResultSet results=null;
        try{

        results = statement.executeQuery("SELECT * FROM PRODUCT");
        return  results;
    }catch (SQLException e){

        }finally {
            try{
              results.close();
              statement.close();
              conn.close();

            }
            catch (Exception e){
            }
        }
        return  results;
        }
    public boolean insertOrder(String product_name, Date date) throws SQLException {
        Connection conn = getConnection();
        Statement statement = conn.createStatement();

            ResultSet results = statement.executeQuery("SELECT id FROM PRODUCT WHERE name =" + product_name);
            int id = results.getInt(1);
            if (statement.execute("INSERT INTO ORDERS (product_id, order_date) VALUES (" + id + "," + date + ")")
            ) {

                return true;
            } else {
                return false;
            }

        }

    public ArrayList getOrderById(int id) throws SQLException {
        Connection conn = getConnection();
        Statement statement = conn.createStatement();
        ResultSet results = statement.executeQuery("SELECT * FROM ORDERS WHERE id ="+id);

        ArrayList orders = new ArrayList();
        while (results.next()) {
            orders.add(results.getInt(1));
            orders.add(results.getInt(2));
            orders.add(results.getDate(3));
        }


        return  orders;

    }
    public ResultSet getAllOrder() throws SQLException {
        Connection conn = getConnection();
        Statement statement = conn.createStatement();


        ResultSet results = statement.executeQuery("SELECT * FROM ORDERS");

        return  results;

    }
    private int getId(String name) throws  SQLException{
        Connection conn = getConnection();
        Statement statement = conn.createStatement();

        ResultSet results = statement.executeQuery("SELECT id FROM CATEGORY WHERE type ='"+name+"'");
        int id = results.getInt(1);

        return id;
    }

}
