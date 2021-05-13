package com.divergent.clinicspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.divergent.clinicspringmvc.entity.Patient;

@Repository
public class PatientDaoImpl implements BaseDao<Patient> {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void insert(Patient patient) {
		
		entityManager.persist(patient);
		
	}

	@Override
	public Patient find(int id) {
		
		Patient patient = entityManager.find(Patient.class, id);
		entityManager.close();
		return patient;
	}

	@Override
	public List<Patient> findAll() {
		
		TypedQuery<Patient> query = entityManager.createQuery("Select p from Patient p", Patient.class);
		List<Patient> patients = query.getResultList();
		entityManager.close();
		return patients;
	}

	@Override
	public void remove(int id) {
		
		Patient patient = entityManager.find(Patient.class, id);
		if (patient != null) {

			entityManager.remove(patient);
			entityManager.close();
		}
		
	}

}
