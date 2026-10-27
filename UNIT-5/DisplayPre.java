import java.sql.*;

public class DisplayPre {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/javadb", "root", "");

        String query = "SELECT * FROM stud";

        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("GRNo: " + rs.getInt("GRNo"));
            System.out.println("Name: " + rs.getString("Name"));
            System.out.println("-------------------");
        }

        rs.close();
        ps.close();
        con.close();
    }
}