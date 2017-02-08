package com.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil
{
	public static Connection getConnection()
	{
		Connection connection =null;
		try
		{
			String driverClass = "com.mysql.jdbc.Driver";
			String url= "jdbc:mysql://localhost:3306/test";
			String username = "root";
			String password ="";
			Class.forName(driverClass);
			connection = DriverManager.getConnection(url,username,password);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return connection;
		
	}
}
