package com.rsp.jdbc.main;

import com.rsp.jdbc.util.JdbcUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LaunchJdbcInsert {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Scanner in = null;

        try {
            connection = JdbcUtility.getConn();
            if (connection != null){
                String query = "INSERT INTO lawnmowers.mowers VALUES(?,?,?,?,?)";
                preparedStatement = connection.prepareStatement(query);
            }
            if (preparedStatement != null){
                in = new Scanner(System.in);
                System.out.println("Please enter id");
                int id = in.nextInt();
                System.out.println("Enter name");
                String name = in.next();
                System.out.println("Enter area");
                double area = in.nextDouble();
                System.out.println("Enter numWeeks");
                int weeks = in.nextInt();
                System.out.println("Enter quote");
                double quote = in.nextDouble();

                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setDouble(3, area);
                preparedStatement.setInt(4, weeks);
                preparedStatement.setDouble(5, quote);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected != 0) System.out.println("Registration successful");
                else System.out.println("Failed to register");
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
