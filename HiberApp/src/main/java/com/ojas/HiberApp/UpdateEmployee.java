package com.ojas.HiberApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ojas.model.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
//		 Configuration cfg = new Configuration();
//			cfg.configure("hibernate.cfg.xml");
//			SessionFactory factory = cfg.buildSessionFactory();
//
//	        Session s= factory.openSession();  
//	  	
//	  	  Transaction t = null;
//	  	try
//		{
//			t = s.beginTransaction();
//			
//			Employee emp1 = (Employee)s.get(Employee.class, 11);
//			emp1.setEname("madhu");
//			emp1.setSalary(100000);
//			s.update(emp1);
//			t.commit();
//
//			System.out.println("Record Updated successfully");
//		}
//		catch(Exception ex)
//		{
//			if(t != null)
//				t.rollback();
//			ex.printStackTrace();
//		}
//		finally
//		{
//			s.close();
//		}


	}

}
