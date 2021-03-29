package com.ojas.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ojas.dao.EmployeeDao;
import com.ojas.model.Employee;
@Service
public class EmployeeService {
 	@Autowired
	private EmployeeDao employeeDao;
	public Iterable<Employee> createEmployees(List<Employee> empList) {
		// TODO Auto-generated method stub
		Iterable<Employee> list = employeeDao.saveAll(empList);
		return list;
	}
	public List<Object[]> findMaxSalariesByDept(List<String> deptNames) {
		// TODO Auto-generated method stub
		return employeeDao.findMaxSalariesByDept(deptNames);
		
	}
}
