package com.rsp.jdbc.main;

import com.rsp.jdbc.util.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchJdbcExecuteUpdate {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JdbcUtil.getConn();
            if (connection != null) {
                statement = connection.createStatement();
                if (statement != null) {
                    boolean status = statement.execute("update mowers set name = 'RSP' where id = 4");
//                    boolean status = statement.execute("delete from mowers where id = 6");
                    if (status) {
                        resultSet = statement.getResultSet();
                        if (resultSet != null) {
                            while (resultSet.next()) {
                                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
                            }
                        }
                    }else {
                        System.out.println("Updated");
                        int rowsAffected = statement.getUpdateCount();
                        System.out.println(rowsAffected);
                    }
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    finally {
            try {
                JdbcUtil.close(connection, statement, resultSet);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
