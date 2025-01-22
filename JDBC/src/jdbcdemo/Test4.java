package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test4 {
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		String sql="select * from student";
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet vs=ps.executeQuery();
		
		while(vs.next())
		{
			System.out.println(vs.getInt(1));
			System.out.println(vs.getString(2));
			
		}
		
	}
	

}
