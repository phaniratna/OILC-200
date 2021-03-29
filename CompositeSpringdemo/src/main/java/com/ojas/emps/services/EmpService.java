package com.ojas.emps.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.emps.daos.EmployeeDao;
import com.ojas.emps.models.EmpPK;
import com.ojas.emps.models.Employee;

@Service
public class EmpService {
	
	@Autowired
	EmployeeDao empDao;
	
	public Employee save(Employee entity) {
		return empDao.save(entity);
	}
	
	public List<Employee> getAll() {
		return empDao.findAll();
	}

	public void delete(EmpPK id) {
		empDao.deleteById(id);
	}
	public Optional<Employee> getById(EmpPK emppk) {
	    return  empDao.findByEmppk(emppk);
    
   }
}
