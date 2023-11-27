package com.rsp.jdbc;
import java.sql.*;
import java.sql.DriverManager;

public class JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

        //Establish the connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lawnmowers","root","projectK");
        System.out.println("Connection established");

        //Statement created, to pass sql query
        Statement statement = con.createStatement();
        System.out.println("Statement object is ready");

        //sending statement to be executed
        ResultSet rs = statement.executeQuery("select * from mowers");
        System.out.println("Result set is obtained");


        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
        }

        rs.close();
        statement.close();
        con.close();
        System.out.println("Connection closed");
    }
}
