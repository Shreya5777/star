package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Test5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 // load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish the connection with database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test3","root","root");
		//construct sql statement
		//String sql="Create table student(rollno int primary key,name varchar(10))";
		String sql="insert into student values(2,'shreya')";
	   //create object of required statement
		Statement stm=con.createStatement();
		//execute sql statement
		stm.execute(sql);
		//closing the resources
		stm.close();
		con.close();
		
		
		
		
		
		
				
		
		
	}

}
