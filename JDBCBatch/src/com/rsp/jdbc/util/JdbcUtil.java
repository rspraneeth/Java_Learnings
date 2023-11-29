package com.rsp.jdbc.util;

import java.sql.*;

public class JdbcUtil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/lawnmowers", "root", "projectK");
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
        if (conn!=null) conn.close();
        if(stmt!=null) stmt.close();
        if(rs!=null) rs.close();
    }
}
