package com.ojas.HiberApp;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ojas.model.EmpPK;
import com.ojas.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )   {

    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		EmpPK mp = new EmpPK();
		mp.setFirstName("Vijaya");
		mp.setLastName("V");
		Employee e = new Employee();
		e.setAddress("Hyderabad");
		e.setEmppk(mp);
		ses.save(e);
		ses.flush();
		tx.commit(); 
		System.out.println("Inserted");

        
    }
}
