import java.sql.*;
import java.util.*;

class Insert
{
	public static void main(String args[])
    {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:33-6/Test01","root","");
			Statement stmt=cn.createStatement();
			Scanner sc=new Scanner(System.in);
			int grno=0;
			String name="";
			System.out.println("Enter grno.");
			grno=sc.nextlnt();
			System.out.println("Enter name.");
			name=sc.nextlnt();
			
			try
			{
				int x=stmt.executeUpadate("Insert into stud Values("+grno+",'"+name+"')");
				System.out.println("No of row inserted :"+x);
				
				
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
