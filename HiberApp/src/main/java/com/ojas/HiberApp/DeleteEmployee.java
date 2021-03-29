package com.ojas.HiberApp;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ojas.model.Employee;

public class DeleteEmployee {
  public static void main(String args[]) {
	  Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

        Session s= factory.openSession();  
  	    Scanner sc = new Scanner(System.in);
  	    System.out.println("Enter employee number to delete ?");
  	  Transaction t = null;
  	try
	{
		t = s.beginTransaction();
		Employee e1 = (Employee)s.get(Employee.class, sc.nextInt());
		s.delete(e1);
		t.commit();
		System.out.println("Record Deleted successfully");
	}
	catch(Exception ex)
	{
		if(t != null)
			t.rollback();
		ex.printStackTrace();
	}
	finally
	{
		s.close();
	}

  }
}
