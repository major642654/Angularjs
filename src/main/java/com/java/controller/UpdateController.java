package com.java.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.UserDao;

public class UpdateController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String ID =request.getParameter("id");
		String name =request.getParameter("name");
		String price = request.getParameter("price");
		UserDao userDao = new UserDao();
		userDao.updateByID(Integer.valueOf(ID), name, price);
	}
}
