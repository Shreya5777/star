package jdbcdemo;


	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
	public class Test
	{
		public static void main(String[] args)throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			String sql="create table student(rollno int primary key,name varchar(20))";
			
			Statement smt=con.createStatement();
			
			smt.execute(sql);
			smt.close();
			con.close();
			
		 System.out.println("thsi is JDBC");
			
		
		}
		System.out.println("this is JDBC program");
}

	}
	


