package com.divergent.clinicspringmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prescription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String prescriptionId;

	public String doctorName;
	
	private String patientName;
	
	private String patientDisease;

	private String prescription;
	
	private String notes;

	private String date;

	public String getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(String prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientDisease() {
		return patientDisease;
	}

	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Prescription() {
		
	}

	public Prescription(String prescriptionId, String doctorName, String patientName, String patientDisease,
			String prescription, String notes, String date) {
		super();
		this.prescriptionId = prescriptionId;
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.patientDisease = patientDisease;
		this.prescription = prescription;
		this.notes = notes;
		this.date = date;
	}
	
	

}
