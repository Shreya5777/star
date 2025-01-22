package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) throws Exception {
		//load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test3","root","root");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno");
		int rollno=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		
		String sql="insert into student values("+rollno+",'"+name+"')";
		Statement smt=con.createStatement();
		smt.execute(sql);
		
				
		
	}

}
