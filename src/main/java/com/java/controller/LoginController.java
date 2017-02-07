package com.java.controller;



import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class LoginController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
        Gson gson = new Gson();
        Person person = gson.fromJson(request.getReader(), Person.class);
        System.out.println(person.getUsername());
        System.out.println(person.getPassword());
        Writer writer = response.getWriter();
        writer.append("123");
        
	}
}
