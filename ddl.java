import java.sql.*;  
public class ddl{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","");    
Statement stmt=con.createStatement(); 
stmt.execute("create table emp(name varchar(20),id int,m1 int)");
System.out.println("table create successfully");
stmt.executeUpdate("drop table emp");
System.out.println("drop successfully");
con.close();  
}
catch(Exception e){ System.out.println(e);
}  
}  
}