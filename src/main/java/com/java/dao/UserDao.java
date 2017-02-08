package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao
{
	Connection connection=null;
    PreparedStatement preparedStatement=null;
    ResultSet resultSet=null;
	DBUtil dbUtil = new DBUtil();
	public boolean login(String user,String pwd)
	{
		String sql  = "Select count(id) from user where username = ? " + 
				"AND password = ?";
		try
		{
			connection = dbUtil.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pwd);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{
				int conunt = resultSet.getInt(1);
				if(conunt>0)
				{			
					System.out.println("µÇÂ¼³É¹¦");
					return true;
					
				}
				else {
					System.out.println("µÇÂ¼Ê§°Ü");
					return false;	
					
				}
			}
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
