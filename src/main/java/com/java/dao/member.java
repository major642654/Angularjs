package com.java.dao;

public class member
{
	private int ID;
	private String name;
	private int age;
	private String Img;
	private String department;
	private String position;
	public int getID()
	{
		return ID;
	}
	public void setID(int iD)
	{
		ID = iD;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getImg()
	{
		return Img;
	}
	public void setImg(String img)
	{
		Img = img;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public String getPosition()
	{
		return position;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
	public member(int ID, String name, int age,String Img, String department, String position)
	{
		super();
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.Img = Img;
		this.department = department;
		this.position = position;
	}  
}
