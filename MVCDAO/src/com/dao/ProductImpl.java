package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



import com.model.Product;

public class ProductImpl implements ProductDAO{


	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		boolean b = false;
		Connection con = ConnectionFactory.getConnection();
		System.out.println(con +"connected");
		try
		{
			PreparedStatement pst = con.prepareStatement("insert into product values(?,?,?)");
			pst.setInt(1,p.getPno());
			pst.setString(2,p.getPname());
			pst.setDouble(3,p.getPrice());
			int res = pst.executeUpdate();
			if(res > 0)
			{
				b = true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return b;
	}

	@Override
	public ArrayList<Product> listProducts() {
		boolean b = false;
		Connection con = ConnectionFactory.getConnection();
		System.out.println(con +"connected");
		ArrayList<Product> list = new ArrayList<>();
		try
		{
			PreparedStatement pst = con.prepareStatement("select * from product");
			ResultSet res = pst.executeQuery();
			while(res.next())
			{
				 Product p = new Product();
				 pres.getInt(1)
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}

	@Override
	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		return false;
	}



	
		
}