package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Test6 {
	public static void main(String[] args) throws Exception {
		//load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test3","root","root");
		
		//construct sql query
		String sql="select * from student";
		
		//create object Statement
		Statement smt=con.createStatement();
		
		//execute sql query
		ResultSet rs=smt.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			
			
		}
			
	}

}
