import java.sql.*;
import java.util.*;
class update
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/javadb","root","");
			Statement stmt=cn.createStatement();
			Scanner sc=new Scanner(System.in);
			int grno=0;
			String name="";
			System.out.println("Enter grno. for which you want to change the name");
			grno=sc.nextInt();
			System.out.println("Enter New name");
			name=sc.next();
			try
			{
				int x=stmt.executeUpdate("Update stud set name='"+name+"'where grno="+grno);
				System.out.println("No of rows affected:"+x);
			}
			catch(Exception e)
			{
				System.out.println("Exception :"+e);
			}
			cn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}