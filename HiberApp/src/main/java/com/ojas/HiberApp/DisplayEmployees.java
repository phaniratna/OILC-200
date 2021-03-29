package com.ojas.HiberApp;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ojas.model.Employee;

public class DisplayEmployees {

	public static void main(String[] args) {
//		 Configuration cfg = new Configuration();
//			cfg.configure("hibernate.cfg.xml");
//			SessionFactory factory = cfg.buildSessionFactory();
//
//	        Session session= factory.openSession();  
//	  	
//	        List<Employee> emps = null;
//			Transaction tx = null;
//			try
//			{
//				tx = session.beginTransaction();
//				Query query = session.createQuery("from Employee");
//				emps = query.getResultList();
//				for(Employee e:emps) {
//					System.out.println(e.getEmpNo() + " " + e.getEname() + e.getSalary());
//				}
//				
//			}
//			catch(Exception ex)
//			{
//				
//					
//				ex.printStackTrace();
//			}
//			finally
//			{
//				session.close();
//			}
			



	}

}
