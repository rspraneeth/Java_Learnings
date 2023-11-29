package com.rsp.jdbc.main;

import com.rsp.jdbc.util.JdbcUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LaunchJdbcUpdate {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner in;

        try {
            connection = JdbcUtility.getConn();
            if (connection != null){
                String query = "update lawnmowers.mowers set name=? where id = ?";
                preparedStatement = connection.prepareStatement(query);
            }
            if (preparedStatement != null){
                in = new Scanner(System.in);
                System.out.println("Please enter id");
                int id = in.nextInt();
                System.out.println("Enter name");
                String name = in.next();


                preparedStatement.setInt(2, id);
                preparedStatement.setString(1, name);


                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected != 0) System.out.println("Update successful");
                else System.out.println("Failed to update");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                JdbcUtility.close(connection, preparedStatement, null);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
