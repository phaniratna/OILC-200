package com.dao;

import java.util.*;

import com.model.Product;
public interface ProductDAO {

	
	  public boolean addProduct(Product p);
	  public ArrayList<Product> listProducts();
	 public boolean deleteProduct(int pid);
	  
}