import java.sql.*;  
class jdbc3{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","");  
Statement stmt=con.createStatement(); 
// stmt.execute("drop table emp");
stmt.execute("create table emp(name varchar(20),emp_id int,salary int)");
System.out.println("table create successfully");
stmt.executeUpdate("insert into emp values('abdullah',101,90000)");
stmt.executeUpdate("insert into emp values('samy',102,99000)");
stmt.executeUpdate("insert into emp values('abdul',103,96000)");
System.out.println("insert successfully");
 ResultSet rs1=stmt.executeQuery("select * from emp");  
while(rs1.next())  
System.out.println(rs1.getString(1)+"  "+rs1.getInt(2)+"  "+rs1.getInt(3)); 
CallableStatement cs=con.prepareCall("{call updateEmpSalary(?,?)}");
            cs.setInt(1,101);
            cs.setDouble(2,50);
            cs.executeUpdate();
ResultSet rs2=stmt.executeQuery("select * from emp"); 
System.out.println("After "); 
while(rs2.next())  
System.out.println(rs2.getString(1)+"  "+rs2.getInt(2)+"  "+rs2.getInt(3)); 
con.close();  
}
catch(Exception e){ System.out.println(e);
}
}
}

BEGIN
UPDATE emp SET salary = salary + new_salary where emp_id=id ;
END