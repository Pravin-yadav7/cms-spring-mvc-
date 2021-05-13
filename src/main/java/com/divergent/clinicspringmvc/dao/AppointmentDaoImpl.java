package com.divergent.clinicspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.divergent.clinicspringmvc.entity.Appointment;

@Repository
public class AppointmentDaoImpl implements AppointmentDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void makeAppointment(Appointment appointment) {
		
		entityManager.persist(appointment);
	}

}
