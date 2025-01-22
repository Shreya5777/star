package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test1 {
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		String sql="Create table student(rollno int primary key,name varchar(20))";
		Statement smt=con.createStatement();
		smt.execute(sql);
		smt.close();
		con.close();
		
	}

}
