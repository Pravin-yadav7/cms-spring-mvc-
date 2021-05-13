package com.divergent.clinicspringmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	int doctorId;
	
	String name;
	
	String email;
	
	String degree;
	
	String specialization;
	
	Integer fee;
	
	String address;
	
	Long contactNo;

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Integer getFee() {
		return fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public Doctor() {
		
	}

	public Doctor(int doctorId, String name, String email, String degree, String specialization, Integer fee,
			String address, Long contactNo) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.email = email;
		this.degree = degree;
		this.specialization = specialization;
		this.fee = fee;
		this.address = address;
		this.contactNo = contactNo;
	}

	
}
