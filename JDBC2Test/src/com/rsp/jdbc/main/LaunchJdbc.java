package com.rsp.jdbc.main;

import com.rsp.jdbc.util.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchJdbc {
    public static void main(String[] args) {
        Connection connection = null;
        Statement  statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtil.getConn();
            if (connection != null) {
                statement = connection.createStatement();
                if (statement != null) {
                    resultSet = statement.executeQuery("select * from mowers");
                    while (resultSet.next()) {
                        System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
                    }
                }
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                JdbcUtil.close(connection, statement, resultSet);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
