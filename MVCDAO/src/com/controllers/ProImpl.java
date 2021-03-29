package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.ProductDAO;
import com.dao.ProductImpl;
import com.model.Product;

public class ProImpl implements ProdInterface{
	public void execute(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException
	{
		PrintWriter pw = res.getWriter();
		
		int pno = Integer.parseInt(req.getParameter("pno"));
		String pname = req.getParameter("pname");
		double price = Double.parseDouble(req.getParameter("price"));
		System.out.println(pno + " " + pname + " " + price);
		ProductDAO obj = new ProductImpl();
		Product p = new Product();
		p.setPno(pno);
		p.setPname(pname);
		p.setPrice(price);
	   if(obj.addProduct(p))
	   {
		   pw.println("product inserted successfully");
	   }
	   else
	   {
		   pw.println("try again");
	   }
	}
}