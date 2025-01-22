package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test2
{
	public static void main(String[] args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Enter rollno");
		int rollno=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		
		String sql="insert into student values("+rollno+",'"+name+"')";
		Statement smt=con.createStatement();
//		smt.execute(sql);
		int value=smt.executeUpdate(sql);
		System.out.println(value);
	}


}
