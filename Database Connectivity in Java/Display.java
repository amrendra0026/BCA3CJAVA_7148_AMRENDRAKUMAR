import java.sql.*;

class Display {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test01", "root", ""
            );

            Statement stmt = cn.createStatement();

            ResultSet re = stmt.executeQuery("SELECT * FROM stud");

            while (re.next()) {
                System.out.println(
                    re.getInt("grno") + "  " +
                    re.getString("name")
                );
            }

            re.close();
            stmt.close();
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}