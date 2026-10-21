import java.sql.*;
import java.util.*;

class Update
{
	public static void main(String srgs[])
	{	
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection("
			jdbc:mysql://localhost:3306/javadb","root","");
			Statement stmt=cn.createStatement();
			Scanner sc=new Scanner(System.in);
			int GRNo=0;
			String Name="";
			System.out.println("Enter GRNo. for which you want to update Name ");
			GRNo=sc.nextInt();
			System.out.println("Enter new Name.");
			Name=sc.next();
			
			try
			{
				int x=stmt.executeUpdate("update stud set name='"+Name+"'Where grno ="+GRNo);
				System.out.println("No. of rows affected:"+x);
			}
			
			catch(Exception e)
			
			{
				System.out.println("Exception:"+e);
			}
			cn.close();
		}
		
		catch(Exception e)
		
		{
			System.out.println(e);
		}
		
	}
}
			
				
				
				
			
