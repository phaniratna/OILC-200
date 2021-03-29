package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	static Connection con = null;
	static ConnectionFactory factory;
	private ConnectionFactory()	{
		
	}
	
	public static ConnectionFactory getInstance(){
		if(factory == null)
		{
			synchronized(ConnectionFactory.class){
				factory = new ConnectionFactory();
			}
		}
		return factory; 
	}
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojasemployees",
					"root","root");
			System.out.println("connected" + con);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	
	
}
