package com.example;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpSpringController {
	
	@GetMapping(value="sayHello")
	public String hello() {
		  return "Hello World";
	  }
}
