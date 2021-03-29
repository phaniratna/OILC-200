package com.ojas.dao;

import java.util.List;

import com.ojas.model.Employee;

public interface EmployeeDAO {
	
		boolean addEmployee(Employee e);
		boolean deleteEmployee(int num);
		boolean updateEmployee(Employee e,int id);
		List<Employee> listEmployee();
	

}
