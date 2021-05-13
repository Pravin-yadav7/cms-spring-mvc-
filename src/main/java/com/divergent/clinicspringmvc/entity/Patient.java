package com.divergent.clinicspringmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	
	@Id
	int patientId;
	
	String patientName;
	
	String address;
	
	String disease;
	
	Integer age;
	
	Long contactNo;
	
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	
	public Patient() {
		
	}

	public Patient(int patientId, String patientName, String address, String disease, Integer age, Long contactNo) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.address = address;
		this.disease = disease;
		this.age = age;
		this.contactNo = contactNo;
	}
	
	

}
