import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lawnmowers", "root", "projectK");
        System.out.println("Connected");
        Statement statement = con.createStatement();
//        String query = "update mowers set name = 'RSP' where id = 2";
        String q = "delete from mowers where id = 6";
        int rowAffected = statement.executeUpdate(q);
        if (rowAffected != 0) {
            System.out.println("Updated");
        } else {
            System.out.println("Not Updated");
        }
        con.close();
        statement.close();

    }
}
