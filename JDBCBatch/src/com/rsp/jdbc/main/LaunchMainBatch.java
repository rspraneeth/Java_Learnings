package com.rsp.jdbc.main;

import com.rsp.jdbc.util.JdbcUtil;

import java.sql.*;
import java.util.Scanner;

public class LaunchMainBatch {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        Scanner in;
        try{
            connection = JdbcUtil.getConn();
            if (connection!=null){
                String query = "UPDATE lawnmowers.mowers SET Name=? WHERE Id=?";
                statement = connection.prepareStatement(query);
                if (statement != null){
                    in = new Scanner(System.in);
                    System.out.println("Enter name");
                    String name = in.next();
                    System.out.println("Enter id");
                    int id = in.nextInt();

                    statement.setString(1, name);
                    statement.setInt(2, id);
                    statement.addBatch();

                    statement.setString(1, "Satya");
                    statement.setInt(2, 2);
                    statement.addBatch();

                    statement.setString(1, "Reddi");
                    statement.setInt(2, 3);
                    statement.addBatch();

                    int[] rowsAffected = statement.executeBatch();
                    // print the array elements
                    for (int j : rowsAffected) {
                        System.out.println(j);
                    }


                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                JdbcUtil.close(connection, statement, null);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
