package com.example;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.domain.Person;
import com.example.services.PersonService;


@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class })
public class SpringFirstJpaApplication implements CommandLineRunner {

	@Autowired
	PersonService personService;
	public static void main(String[] args) {
		SpringApplication.run(SpringFirstJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("welcome");
		createPersons();
		System.out.println("Inserted Successfully");
		
	}

	 private void createPersons() {
		
		 
			List<Person> persons = Arrays.asList(
					 new Person("Kiran","Kumar","Kiran@gmail.com",new Date()),
					 new Person("Sandya","Rani","Sandya@gmail.com",new Date()));
			personService.createPerson(new Person("Sandya","Rani","Sandya@gmail.com",new Date()));
				                  
	 }

}
