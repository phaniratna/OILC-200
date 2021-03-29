package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ojas.dao.EmployeeDao;
import com.ojas.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Transactional
	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}

	@Transactional(readOnly = true)
	public List<Employee> getAll() {
		return dao.getAll();
	}

	@Transactional
	public void delete(int empid) {
		dao.delete(empid);
	}

	@Transactional
	public void update(Employee emp) {
		dao.update(emp);
	}

	@Transactional(readOnly = true)
	public Employee getEmpById(int empid) {
		return dao.getEmpById(empid);
	}

	public boolean checkLogin(String email, String password) {
		return dao.checkLogin(email, password);
	}

}
