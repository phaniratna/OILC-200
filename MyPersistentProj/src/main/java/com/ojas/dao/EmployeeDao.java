package com.ojas.dao;

import java.util.List;

import com.ojas.model.Employee;

public interface EmployeeDao {
	
	public void saveEmployee(Employee employee);
	
	public List<Employee> getAll();
	
	public void delete(int empid);
	
	public void update(Employee emp);
	
	public Employee getEmpById(int empid);
	
	public boolean checkLogin(String email,String password);
}
