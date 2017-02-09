package com.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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
					System.out.println("登录成功");
					return true;
					
				}
				else {
					System.out.println("登录失败");
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
	public void regist(String user,String passwd)
	{
		String sql= "insert into user (username,password) values (?,?)";
		try
		{
			connection = dbUtil.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, passwd);
			preparedStatement.executeUpdate();
			System.out.println("插入成功");
		} catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public List<Product> getAll()
	{
		List<Product> products = new ArrayList<Product>();
		String sql = "Select id,name,img,price from product";
		try
		{
			connection = dbUtil.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next())
			{	
				int ID = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String img = resultSet.getString(3);
				String price = resultSet.getString(4);		
				//System.out.println(ID+name+price);
				Product product = new Product(ID, name,img, price);
				products.add(product);
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return products;
		
	}
}
