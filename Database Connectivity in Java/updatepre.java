import java.sql.*;
import java.util.*;
class updatepre
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/javadb","root","");
			
			String sql="UPDATE stud2 SET name=? WHERE grno=?";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter grno. for which you want to change the name:");
			int grno=sc.nextInt();
		    System.out.println("Enter new name:");
			String name=sc.next();
			
			pstmt.setString(1,name);
			pstmt.setInt(2,grno);
			
			int x=pstmt.executeUpdate();
			System.out.println("No of Rows Affected:"+x);
			 cn.close();
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}