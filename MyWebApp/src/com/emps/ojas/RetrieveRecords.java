package com.emps.ojas;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetrieveRecords
 */
@WebServlet("/RetrieveRecords")
public class RetrieveRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	Connection con = null;
    public RetrieveRecords() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ojasemployees","root","root");
			System.out.println(con + "connected successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw = response.getWriter();
		 try {
			 
		   Statement st =  con.createStatement();
		   ResultSet res = st.executeQuery("select * from employee");
		while(res.next()) {
			pw.println(res.getInt(1) +" "+ res.getString(2) + "" + res.getDouble(3));
			java.util.Date d = res.getDate(4);
			//SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy");
			//String date =  s1.format(d);
			//pw.println(date+"<br>");
		}
		 }
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
