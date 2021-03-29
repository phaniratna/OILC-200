package com.ojas.validator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ojas.model.Employee;

@Component
@ComponentScan(basePackages = "{com.ojas.init}")

public class EmployeeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Employee.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "email", "email can't be empty","field cant be empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "password can't be empty","field cant be empty");
		ValidationUtils.rejectIfEmpty(errors, "confirmPassword", "confirm password can't be empty","field cant be empty");
		Employee emp = (Employee)target;
		
		if(!(emp.getPassword().equals(emp.getConfirmPassword()))){
			errors.rejectValue("password", "password", "password and confirm password should be matched");
		}
	}

	

}
