package com.ojas.dao;

import com.ojas.model.Employee;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class EmployeeDAO {
   	public boolean addEmployee(Employee emp) {
		boolean b = false;
		Connection con = ConnectionFactory.getConn();
		try {
			PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1, emp.getEmpno());
			pst.setString(2, emp.getEname());
			pst.setDouble(3, emp.getSalary());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			 java.util.Date d = sdf.parse(emp.getHiredate());
			 long l = d.getTime();
			 java.sql.Date d1 = new java.sql.Date(l);
			 pst.setDate(4, d1);
			
			 
			int a = pst.executeUpdate();
			if(a > 0) {
				b = true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return b;
	}
   	public ArrayList<Employee> listEmployees() {
		
		Connection con = ConnectionFactory.getConn();
		ArrayList<Employee> listEmps = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement("select * from employee");
			ResultSet res  = pst.executeQuery();
			System.out.println(res+ "from");
			while(res.next()) {
				Employee emp = new Employee(res.getInt(1),res.getString(2),
						res.getDouble(3),res.getString(4));
				listEmps.add(emp);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return listEmps;
		
	}
	public boolean deleteEmployee(int empNo) {
		boolean b = false;
		Connection con = ConnectionFactory.getConn();
		try {
			PreparedStatement pst = con.prepareStatement(
		"delete from employee where empno =?");
			pst.setInt(1, empNo);
			int a = pst.executeUpdate();
			if(a > 0) {
				b = true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return b;
	}
}
