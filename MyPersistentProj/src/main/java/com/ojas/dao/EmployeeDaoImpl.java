package com.ojas.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ojas.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private HibernateTemplate ht;
	@Autowired
	private SessionFactory sf;

	public void saveEmployee(Employee employee) {
		ht.save(employee);
	}

	public List<Employee> getAll() {
		return ht.loadAll(Employee.class);
	}

	public void update(Employee emp) {
		ht.update(emp);
	}

	public Employee getEmpById(int empid) {
		return ht.get(Employee.class, empid);
	}

	public void delete(int empid) {
		ht.delete(new Employee(empid));
	}

	public boolean checkLogin(String email, String password) {
		boolean userFound = false;
		Session session = sf.openSession();
		String query = "From Employee as emp where emp.email = '"+email+"' and emp.password = '"+password+"'";
		Query q = session.createQuery(query);
		List list = q.list();
		if((list != null) && (list.size()>0))
			userFound = true;
		else
			userFound = false;
		session.close();
		return userFound;
	}
	
	

}
