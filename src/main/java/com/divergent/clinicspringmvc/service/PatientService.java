package com.divergent.clinicspringmvc.service;

import java.util.List;

import com.divergent.clinicspringmvc.entity.Patient;

public interface PatientService {
	
	public void insert(Patient patient);

	public List<Patient>findAll();

	public Patient find(int patientId);

	public void delete(int patientId);

}
