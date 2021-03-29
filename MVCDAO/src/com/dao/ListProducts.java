package com.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controllers.ProImpl;
import com.controllers.ProdInterface;
import com.model.Product;

public class ListProducts implements ProdInterface {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		ProductDAO obj = new ProductImpl();
		ArrayList<Product> list = obj.listProducts();
		for(Product p: list)
		{
			pw.println(p.getPno() + " " + p.getPname() + p.getPrice()+"<br>");
		}
		
		
		
		
	}

}