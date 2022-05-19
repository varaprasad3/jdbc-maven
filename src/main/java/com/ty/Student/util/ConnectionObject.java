package com.ty.Student.util;


	import java.sql.SQLException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	public class ConnectionObject 
	{
		static Connection connection = null;
		static String url = "jdbc:mysql://localhost:3306/javabatch";
		static String username = "root";
		static String password = "root";
		public static Connection getConnection()
		{
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");   
	    	connection = DriverManager.getConnection(url, username, password);
	    	return connection;
	    	}
	    catch(ClassNotFoundException a)
	    {
	    	a.printStackTrace();
	    }
	    catch(SQLException e)
	    {
	    	e.printStackTrace();
	    }
	       return null;
	       
		}
	}


