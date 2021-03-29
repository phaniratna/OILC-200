package com.ojas.JaxBDemos;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.ojas.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        System.out.println( "Hello World!" );
        Employee emp = new Employee();
        emp.setEmpNo(10);
        emp.setName("Sai");
        emp.setSalary(45000);
        JAXBContext context =  JAXBContext.newInstance(Employee.class);
        Marshaller marshaller = context.createMarshaller();
        
        marshaller.marshal(emp,System.out);
       
       // marshaller.marshal(emp,new File("D://data//Employee.xml"));
    	
    	System.out.println(emp1);
    }
}
