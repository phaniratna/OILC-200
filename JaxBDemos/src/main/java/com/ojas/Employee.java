package com.ojas;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
public class Employee implements Serializable {
   private int empNo;
   public int getEmpNo() {
	return empNo;
}
   @XmlElement
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getName() {
	return name;
}
@XmlElement
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
@XmlElement
public void setSalary(double salary) {
	this.salary = salary;
}
private String name;
   private double salary;
   
}