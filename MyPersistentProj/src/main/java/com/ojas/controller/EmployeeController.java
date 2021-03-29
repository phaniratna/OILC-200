package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ojas.model.Employee;
import com.ojas.service.EmployeeService;
import com.ojas.validator.EmployeeValidator;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@Autowired
	EmployeeValidator validator;

	@RequestMapping("/")
	public String showHomePage(ModelMap map) {
		map.addAttribute("login", new Employee());

		return "Home";
	}

	@RequestMapping("/registration")
	public String showRegPage(ModelMap map) {
		Employee emp = new Employee();
		map.addAttribute("employee", emp);
		
		return "Registration";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savePage(@ModelAttribute("employee") @Validated Employee emp,ModelMap map,BindingResult result) {
		validator.validate(emp, result);
		if(result.hasErrors()) {
			return "Registration";
		}
		else {
		List<Employee> emp1 = service.getAll();
		map.addAttribute("list", emp1);
		service.saveEmployee(emp);
		return "redirect:/view";
		}
	}

	@RequestMapping("/view")
	public String view(ModelMap map) {
		List<Employee> emp = service.getAll();
		map.addAttribute("list", emp);
		return "viewPage";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer empid){
		service.delete(empid);
		return "redirect:/view";
		
	}
	
	@RequestMapping("/editform")
	public String editform(@RequestParam Integer empid, ModelMap map) {
		Employee emp = service.getEmpById(empid);
		map.addAttribute("emp", emp);
		return "editForm";
		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updatePage(@ModelAttribute("employee") Employee emp,ModelMap map) {
		List<Employee> emp1 = service.getAll();
		map.addAttribute("list", emp1);
		service.update(emp);
		return "redirect:/view";
	}
	
	@RequestMapping("/loginForm")
	public String loginForm(ModelMap map) {
		Employee emp = new Employee();
		map.addAttribute("login",emp );
		return "Login";
		
	}
		
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("employee") @Validated Employee emp,ModelMap map,BindingResult r) {
		Boolean userExists = service.checkLogin(emp.getEmail(), emp.getPassword());
		if(userExists == true ) {
			return "redirect:/view";
		}
		else {
			map.addAttribute("login", emp);
			return "Registration";
		}
		
	}
	
	}


