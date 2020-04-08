import java.sql.*;  
class MysqlCon7{  
   public int add(
         int num1,
         int num2,
         int num3,
         int num4,
         int num5,
         int num6,
         int num7,
         int num8,
         int num9,
         int num10,
         int num11,
         int num12,
         int num13,
         int num14,
         int num15,
         int num16,
         int num17,
         int num18,
         int num19,
         int num20
         ){ 
            return num1+num2+num3+num4+num5+num6+num7+num8+num9+num10+num11+num12+num13+num14+num15+num16+num17+num18+num19+num20
         }  
   public static void main7(String args[]){  
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
      }catch(Exception e){ System.out.println(e);}  
   }  
}  
