package com.ojas.emps.daos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.emps.models.EmpPK;
import com.ojas.emps.models.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee,EmpPK> {

	Optional<Employee> findByEmppk(EmpPK emppk);

	
}
