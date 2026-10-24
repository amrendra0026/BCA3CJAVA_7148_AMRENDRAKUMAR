import java.sql.*;
import java.util.*;
class deletepre
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/javadb","root","");
			
			String sql="DELETE FROM stud2 WHERE grno=?";
			PreparedStatement pstmt=cn.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter grno.for the record you want to delete:");
			int grno=sc.nextInt();
			
			pstmt.setInt(1,grno);
			
			int x=pstmt.executeUpdate();
			System.out.println("No of rows affected:"+x);
			
			cn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}