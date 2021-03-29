package com.ojas.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.dao.EmployeeDAO;
import com.ojas.model.Employee;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		EmployeeDAO empDAO = new EmployeeDAO();
		ArrayList<Employee> empList = empDAO.listEmployees();
		pw.println("<body><form action=DeleteEmployee method=POST>");
		pw.println("Select employee number :");
		pw.println("<select name ='empno'>");
		for(Employee emp : empList) {
			pw.println("<option>" + emp.getEmpno() + "</option>");
		}
		pw.println("</select></p><input type=submit value='DELETE RECORD'>");
		pw.println("</body>");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployeeDAO empDAO = new EmployeeDAO();
		if(empDAO.deleteEmployee(empno)) {
			pw.println("Deleted successfully<br>");
	pw.println("<font color=green><a href=EmployeeData>list employees</a></font>");
		}
		else {
			System.out.println("Try Again");
		}
	}

}
