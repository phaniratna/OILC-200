package com.ojas.emps.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.emps.models.EmpPK;
import com.ojas.emps.models.Employee;
import com.ojas.emps.services.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@PostMapping("/addemp")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		empService.save(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}
	
	@GetMapping("/getemps")
	public List<Employee> getEmployees() {
		return  empService.getAll();
		
	}
	@GetMapping("/getempsbyname")
	public Optional<Employee> getByEmpsId(@RequestBody EmpPK emppk) {
		 return  empService.getById(emppk);
	}

}
