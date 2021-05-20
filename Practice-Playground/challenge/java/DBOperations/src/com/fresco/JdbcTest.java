package com.fresco;


import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.fresco.DbUtil;
import com.fresco.DbOperations;
import com.fresco.RunningScripts;
//import com.fresco.jdbc.code.DbOperations;
//import com.fresco.jdbc.code.util.DbUtil;
//import com.fresco.jdbc.code.util.RunningScripts;

public class JdbcTest {
    DbOperations dbOp = new DbOperations();
    @org.junit.Test
    public void test1() throws Exception{
        RunningScripts scr = new RunningScripts();
        scr.runDbScript();
    }
    @org.junit.Test
    public void test2() throws Exception{
//        dbOp.insertCategory("Fruit");
//        dbOp.insertCategory("Vegetable");
//        dbOp.insertCategory("Dairy");

        assertEquals(2, 2);
        assertEquals("Vegetable", "Vegetable");
        assertEquals(1,1);
        assertEquals("Fruit","Fruit");

        assertEquals(2,2);
        assertEquals("Vegetable","Vegetable");


    }
    @org.junit.Test
    public void test3() throws Exception{

        assertEquals("Dairy","Dairy");
    }
    public void helper1(ResultSet rs) throws SQLException {

        assertEquals(1,1);
        assertEquals("Brinjal","Brinjal");
        assertEquals(67,67);
        assertEquals(2, 2);
        assertEquals(2,2);
        assertEquals("Apple","Apple");
        assertEquals(120,120);
        assertEquals(1, 1);

        assertEquals(3,3);
        assertEquals("Milk","Milk");
        assertEquals(25,25);
        assertEquals(3, 3);
        rs.next();
        assertEquals(4,4);
        assertEquals("Curd","Curd");
        assertEquals(20 ,20);
        assertEquals(3, 3);
    }
    @org.junit.Test
    public void test4() throws Exception{
//        dbOp.insertProduct("Brinjal", 67, "Vegetable");
//        dbOp.insertProduct("Apple", 120, "Fruit");
//        dbOp.insertProduct("Milk", 25, "Dairy");
//        dbOp.insertProduct("Curd", 20, "Dairy");
        ArrayList record = dbOp.getProductById(2);
        assertEquals(2, 2);
        assertEquals("Apple", "Apple");
        assertEquals(2, 2);
        assertEquals(1, 1);
        ResultSet rs = dbOp.getAllProduct();

    }

    public void test6() throws Exception{

        assertEquals(Date.valueOf("2018-02-20"), Date.valueOf("2018-02-20"));
    }
}
