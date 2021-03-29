package com.ojas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;


@Entity
@Table(name = "employee_tab3")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empid;
	private String firstname;
	private String lastname;
	private String address;
	@Email
	private String email;
	private Integer contactNo;
	private String password;
	private String confirmPassword;

	public Employee() {
		super();
	}
	

	public Employee(Integer empid) {
		super();
		this.empid = empid;
	}
	
	
	

	public Employee(Integer empid, String firstname, String lastname, String address, String email, Integer contactNo,
			String password, String confirmPassword) {
		super();
		this.empid = empid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.email = email;
		this.contactNo = contactNo;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}


	public Integer getEmpid() {
		return empid;
	}


	public void setEmpid(Integer empid) {
		this.empid = empid;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getContactNo() {
		return contactNo;
	}


	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", address="
				+ address + ", email=" + email + ", contactNo=" + contactNo + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + "]";
	}


	
	


	
}
