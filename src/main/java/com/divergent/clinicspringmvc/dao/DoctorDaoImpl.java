package com.divergent.clinicspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.divergent.clinicspringmvc.entity.Doctor;

@Repository
public class DoctorDaoImpl implements BaseDao<Doctor> {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void insert(Doctor doctor) {
		
		entityManager.persist(doctor);	
	}

	@Override
	public Doctor find(int id) {
		
		Doctor doctor = entityManager.find(Doctor.class, id);
		entityManager.close();
		return doctor;
	}

	@Override
	public List<Doctor> findAll() {
		
		TypedQuery<Doctor> query = entityManager.createQuery("Select d from Doctor d", Doctor.class);
		List<Doctor> doctors = query.getResultList();
		entityManager.close();
		return doctors;
	}

	@Override
	public void remove(int id) {
		
		Doctor doctor = entityManager.find(Doctor.class, id);
		if (doctor != null) {

			entityManager.remove(doctor);
			entityManager.close();
		}
		
	}

}
