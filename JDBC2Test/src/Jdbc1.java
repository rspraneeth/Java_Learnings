import java.sql.*;

public class Jdbc1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lawnmowers","root","projectK");
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("select * from mowers");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4)+" "+rs.getDouble(5));
        }

        String query = "insert into mowers values(6, 'rewq', 4, 5, 65)";
        int rowAffected = statement.executeUpdate(query);
        if(rowAffected !=0) System.out.println("Data added");
        else System.out.println("Failed to add");

        ResultSet rs1 = statement.executeQuery("select * from mowers");
        while(rs1.next()){
            System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getDouble(3)+" "+rs1.getInt(4)+" "+rs1.getDouble(5));
        }

        statement.close();
        rs.close();
        rs1.close();
        con.close();

    }
}
