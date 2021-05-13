package com.divergent.clinicspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergent.clinicspringmvc.dao.AppointmentDao;
import com.divergent.clinicspringmvc.entity.Appointment;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentDao appointmentDao;
	
	@Transactional
	@Override
	public void makeAppointment(Appointment appointment) {
		
		appointmentDao.makeAppointment(appointment);
	}

}
