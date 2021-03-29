package com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ProdInterface {
	
	public void execute(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException;
}
