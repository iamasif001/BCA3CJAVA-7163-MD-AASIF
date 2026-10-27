import java.sql.*;
import java.util.Scanner;

public class UpdatePre {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/javadb", "root", "");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GRNo: ");
        int GRNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Name: ");
        String Name = sc.nextLine();

        String query = "UPDATE stud SET Name = ? WHERE GRNo = ?";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, Name);
        ps.setInt(2, GRNo);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Record Updated Successfully!");
        } else {
            System.out.println("Record Not Found!");
        }

        ps.close();
        con.close();
        sc.close();
    }
}