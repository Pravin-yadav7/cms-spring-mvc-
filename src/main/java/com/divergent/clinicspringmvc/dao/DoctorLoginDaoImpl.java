package com.divergent.clinicspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.divergent.clinicspringmvc.entity.Doctor;

public class DoctorLoginDaoImpl implements DoctorLoginDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Doctor login(String name) {
		
		Doctor doctor = entityManager.find(Doctor.class, name);
		return doctor;
	}

}
