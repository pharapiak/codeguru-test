import java.sql.*;  
class MysqlCon3{  
   public static void main3(String args[]){  
      try{  
         Class.forName("com.mysql.jdbc.Driver");  
         Connection con=DriverManager.getConnection(  
               "jdbc:mysql://localhost:3306/sonoo","root","root");  
         //here sonoo is database name, root is username and password  
         Statement stmt=con.createStatement();  
         ResultSet rs=stmt.executeQuery("select * from emp");  
         while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
         //con.close();  
      }catch(Exception e){ System.out.println(e);
         if(con!=null) { con.close();}
         //if(stmt!=null) { stmt.close();}
         if(rs!=null) { rs.close();}
      }  
   }  
}  
