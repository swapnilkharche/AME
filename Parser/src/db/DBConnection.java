package db;

import java.sql.*;

public class DBConnection 
{
	
	private static String dbUrl = "jdbc:mysql://localhost:3306/dblp1";
	private static String user = "root";
	private static String password = "root";

	public static Connection getConn() 
	{
		try 
		{
			Class.forName("org.gjt.mm.mysql.Driver");
			return DriverManager.getConnection(dbUrl, user, password);
		} 
		catch (Exception e) 
		{
			System.out.println("Error while opening a conneciton to database server: "
								+ e.getMessage());
			return null;
		}
	}
}