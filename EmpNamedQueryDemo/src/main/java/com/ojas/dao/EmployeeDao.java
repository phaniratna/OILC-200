package com.ojas.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ojas.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee,Long> {
	public List<Object[]> findMaxSalariesByDept(List<String> deptNames);
}
