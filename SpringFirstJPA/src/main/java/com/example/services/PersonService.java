package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PersonDao;
import com.example.domain.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	public Person createPerson(Person p) {
		return personDao.save(p);
	}
	public List<Person> findByLastName(String lastName){
		return personDao.findByLastName(lastName);
	}
	

}
