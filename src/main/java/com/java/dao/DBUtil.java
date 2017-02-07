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
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;	
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
		}finally{			
			try
			{
				if(preparedStatement !=null)
				{
					preparedStatement.close();
				}
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				if(connection !=null)
				{
					connection.close();
				}
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				if(resultSet !=null)
				{
					resultSet.close();
				}
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return connection;
		
	}
}
