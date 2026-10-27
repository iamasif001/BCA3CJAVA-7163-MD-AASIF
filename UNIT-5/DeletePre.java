import java.sql.*;
import java.util.Scanner;

public class DeletePre {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/javadb", "root", "");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GRNo to Delete: ");
        int GRNo = sc.nextInt();

        String query = "DELETE FROM stud WHERE GRNo = ?";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, GRNo);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Record Deleted Successfully!");
        } else {
            System.out.println("Record Not Found!");
        }

        ps.close();
        con.close();
        sc.close();
    }
}