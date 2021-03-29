package com.ojas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "employees")
public class Employee {

	@EmbeddedId
	private EmpPK emppk;
	private String address;
	public EmpPK getEmppk() {
		return emppk;
	}
	public void setEmppk(EmpPK emppk) {
		this.emppk = emppk;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
