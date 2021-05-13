package com.divergent.clinicspringmvc.service;

import java.util.List;

import com.divergent.clinicspringmvc.entity.Doctor;

public interface DoctorService {
	
	public void insert(Doctor doctor);

	public List<Doctor>findAll();

	public Doctor find(int doctorId);

	public void delete(int doctorId);

}
