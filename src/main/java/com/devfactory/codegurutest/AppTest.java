import java.sql.*;

class AppTest {
   public static void main1(String args[]) {
      Connection con = null;
      Statement stmt = null;
      ResultSet rs = null;
      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
            // here sonoo is database name, root is username and password
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from emp");
            while (rs.next())
               System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            // con.close();
         } catch (Exception e) {
            System.out.println(e);
            if (con != null) {
               con.close();
            }
            if (stmt != null) {
               stmt.close();
            }
            // if(rs!=null) { rs.close();}
         } finally {
            if (con != null) {
               con.close();
            }
            if (stmt != null) {
               stmt.close();
            }
            // if(rs!=null) { rs.close();}
         }
      } catch (SQLException e) {
         System.out.println(e);
         if (con != null) {
            con.close();
         }
         if (stmt != null) {
            stmt.close();
         }
         // if(rs!=null) { rs.close();}

      }
   }
}