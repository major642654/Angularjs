package com.java.dao;

public class Product
{
	private int ID;
	private String name;
	private String img;
	private String price;
	public int getID()
	{
		return ID;
	}
	public void setID(int id)
	{
		ID = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getImg()
	{
		return img;
	}
	public void setImg(String img)
	{
		this.img = img;
	}
	public String getPrice()
	{
		return price;
	}
	public void setPrice(String price)
	{
		this.price = price;
	}
	public Product(int id,String name,String img,String price)
	{
		this.ID=id;
		this.name=name;
		this.img=img;
		this.price=price;
	}
}
