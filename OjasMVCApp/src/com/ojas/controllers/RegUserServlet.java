package com.ojas.controllers;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ojas.dao.EmployeeDAO;
import com.ojas.model.Employee;
import javax.servlet.http.Part;
/**
 * Servlet implementation class RegUserServlet
 */
@WebServlet("/RegUserServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,//2MB
maxFileSize = 1024 * 1024 *10,  //10MB
maxRequestSize = 1024 * 1024 * 50)
public class RegUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegUserServlet() {
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
		PrintWriter pw = response.getWriter();
		 int num = Integer.parseInt(request.getParameter("empno").trim());
		 String ename = request.getParameter("ename").trim();     
		 double salary = Double.parseDouble(request.getParameter("salary").trim());
		 String hiredate = request.getParameter("hiredate").trim();
		 //Part part = request.getPart("file");
		 //String fileName = extractFileName(part);
//		 String savePath="D:\\jj\\OjasMVCApp\\WebContent\\images"+File.pathSeparator +"" +fileName;
//		 File fileNameDir = new File(savePath);
//		 part.write(savePath +File.separator);
		 Employee emp = new Employee(num,ename,salary,hiredate);
		 EmployeeDAO obj = new EmployeeDAO();
		 if(obj.addEmployee(emp)) {
			 pw.println("<h1>You have registered successfully</h1>");
			 pw.println("<br><a href = EmployeeData>Display Employees</a>");
		 }
		 else {
			 pw.println("Try Again");
		 }
		 
	}
//	private String extractFileName(Part part) {
//		String contentDisp = part.getHeader("content-disposition");
//		String[] items = contentDisp.split(";");
//		for(String s:items) {
//			if(s.trim().startsWith("filename")) {
//			return s.substring(s.indexOf("="));
//			}
//		}
//		return "";
//		
//	}

}
