package com.ust.sample.EmployeeDemo.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USTEmployee")
public class Employee {
	@Id
	@GeneratedValue
	private int empId;
	private String empname;
	private String location;
	private String domain;
	private String emailid;
	private String experience;
	
	public Employee() {
		
	}
	
	
	public Employee(int empId, String empname, String location, String domain, String emailid, String experience) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.location = location;
		this.domain = domain;
		this.emailid = emailid;
		this.experience = experience;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
	
}
