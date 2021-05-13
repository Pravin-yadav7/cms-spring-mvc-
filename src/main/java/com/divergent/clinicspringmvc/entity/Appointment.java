package com.divergent.clinicspringmvc.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointId;
	
	private String patientName;
	
	private String doctorName;
	
	private String disease;
	
	private String specialization;
	
	private int doctorFee;
	
	private String dateOfAppointment;
	
	private String timeOfAppointment;

	public int getAppointId() {
		return appointId;
	}

	public void setAppointId(int appointId) {
		this.appointId = appointId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getDoctorFee() {
		return doctorFee;
	}

	public void setDoctorFee(int doctorFee) {
		this.doctorFee = doctorFee;
	}

	public String getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(String dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public String getTimeOfAppointment() {
		return timeOfAppointment;
	}

	public void setTimeOfAppointment(String timeOfAppointment) {
		this.timeOfAppointment = timeOfAppointment;
	}

	public Appointment() {
		
	}

	public Appointment(String patientName, String doctorName, String disease, String specialization, int doctorFee,
			String dateOfAppointment, String timeOfAppointment) {
		super();
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.disease = disease;
		this.specialization = specialization;
		this.doctorFee = doctorFee;
		this.dateOfAppointment = dateOfAppointment;
		this.timeOfAppointment = timeOfAppointment;
	}
	
	

}
