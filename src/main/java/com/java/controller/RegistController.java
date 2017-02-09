package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.java.dao.UserDao;

public class RegistController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		Gson gson = new Gson();
        User person = gson.fromJson(request.getReader(), User.class);
        String user = person.getUsername();
        String passwd = person.getPassword();
        UserDao userDao = new UserDao();
        userDao.regist(user, passwd);
        PrintWriter writer = response.getWriter();
        writer.append("200");
	}
}
