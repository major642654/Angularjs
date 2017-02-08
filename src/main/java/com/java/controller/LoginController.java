package com.java.controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.java.dao.UserDao;

public class LoginController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
        Gson gson = new Gson();
        User person = gson.fromJson(request.getReader(), User.class);
        String user = person.getUsername();
        String pwd = person.getPassword();
        UserDao userDao = new UserDao();
        boolean flag = userDao.login(user, pwd);
        System.out.println(flag);
        PrintWriter writer = response.getWriter();
        if(flag)
        {
        	writer.append("200");
        }
        else {
			writer.append("400");
		}
	}
}
