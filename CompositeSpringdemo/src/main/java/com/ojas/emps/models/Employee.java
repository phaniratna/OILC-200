package com.ojas.emps.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees_data")

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
/*
 * {
	"emppk":{
        "firstName": "c",
	     "lastName": "Rama krishna"
    },
    "address": "hyd"
    }
 * */
