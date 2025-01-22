package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class Test3 
{
	

	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			
			String sql="insert into student values(?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, 4);
			ps.setString(2,"GK");
			ps.executeUpdate();
			
			ps.setInt(1, 5);
			ps.setString(2, "KK");
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			
		}
		
			
			finally
			{
				try
				{
					ps.close();
					con.close();
				}
				catch(Exception e2) {
			}
	}
	}
}


