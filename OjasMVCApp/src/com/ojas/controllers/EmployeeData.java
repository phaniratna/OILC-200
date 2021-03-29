package com.ojas.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.dao.EmployeeDAO;
import com.ojas.model.Employee;

/**
 * Servlet implementation class EmployeeData
 */
@WebServlet("/EmployeeData")
public class EmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            EmployeeDAO dao = new EmployeeDAO();
            ArrayList<Employee> empList = dao.listEmployees();
            pw.println("<table bgcolor = yellow calspan = 20px align=center border =1>");
            for(Employee e: empList) {
            	  pw.println("<tr><td>"+e.getEmpno() + "</td>");
            	  pw.println("<td>"+e.getEname() + "</td>");
            	  pw.println("<td>"+e.getSalary() + "</td>");
            	  pw.println("<td>"+e.getHiredate() + "</td></tr>");

            }
            pw.println("</table>");
            
            
            
            
            
	}

}
