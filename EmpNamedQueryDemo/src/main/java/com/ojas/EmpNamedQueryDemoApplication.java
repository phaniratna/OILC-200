package com.ojas;

import java.util.Arrays;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ojas.model.Employee;
import com.ojas.service.EmployeeService;
@SpringBootApplication
public class EmpNamedQueryDemoApplication implements CommandLineRunner{
	@Autowired
	private EmployeeService empService;
	public static void main(String[] args) {
		SpringApplication.run(EmpNamedQueryDemoApplication.class, args);
		System.out.println("Hello");
	}
	private void createEmployees() {
		     List<Employee> empList = 
		   Arrays.asList(Employee.create("Kiran Kumark","Training", 20000),
				   Employee.create("Sandya Rani", "Training", 30000),
				   Employee.create("Vani", "Training", 45000),
				   Employee.create("Jashwanth", "Developer", 80000));
		    		
		Iterable<Employee> list = empService.createEmployees(empList);
		for (Employee emp : list) {
			System.out.println("Person Object" + emp.toString());

		}

	}
	@Override
	public void run(String... args) throws Exception {
		//createEmployees();
		findMaxSalariesbyDept();
		
	}
	private void findMaxSalariesbyDept() {
		System.out.println(" -- finding max salaries in Admin and IT depts  --");
		List<Object[]> list = empService.findMaxSalariesByDept(Arrays.asList("Training"));
		list.forEach(arr -> {
			System.out.println(Arrays.toString(arr));
		});
	}
}
