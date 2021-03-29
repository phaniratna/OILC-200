package com.ojas.model;

public class Employee {
	private int empno;
	private String ename;
	private double salary;
	private String hiredate;
	
	
	public int getEmpno() {
		return empno;
	}
	public Employee(int empno, String ename, double salary, String hiredate) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.hiredate = hiredate;
		
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + 
				", hiredate=" + hiredate + "]";
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
}
