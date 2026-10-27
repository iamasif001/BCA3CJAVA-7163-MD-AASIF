import java.sql.*;
import java.util.Scanner;

public class InsertPre {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/javadb", "root", "");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter GRNo: ");
        int GRNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String Name = sc.nextLine();

        String query = "INSERT INTO stud VALUES (?, ?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, GRNo);
        ps.setString(2, Name);

        int rows = ps.executeUpdate();

        if (rows > 0) {
            System.out.println("Record Inserted Successfully!");
        }

        ps.close();
        con.close();
        sc.close();
    }
}