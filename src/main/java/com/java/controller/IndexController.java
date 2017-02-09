package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.java.dao.Product;
import com.java.dao.UserDao;

public class IndexController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setCharacterEncoding("utf-8");
		UserDao userDao = new UserDao();
		List<Product> products = userDao.getAll();
		PrintWriter writer = response.getWriter();
		String resJSON = JSON.toJSONString(products);
		//System.out.println(resJSON);
		writer.print(resJSON); 
	}
}
