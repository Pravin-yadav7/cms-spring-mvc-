package com.divergent.clinicspringmvc.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.divergent.clinicspringmvc.entity.Appointment;
import com.divergent.clinicspringmvc.entity.Doctor;
import com.divergent.clinicspringmvc.entity.Patient;
import com.divergent.clinicspringmvc.service.AppointmentService;

@Controller
//@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@PersistenceContext
	EntityManager entityManager;

	public AppointmentController() {
		super();
	}
	
	//@PostMapping
	@RequestMapping(value="/appointment")
	protected String save(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String patientDisease = null;
		String specialization = null;
		int doctorFee = 0;
		String patientName = request.getParameter("patient_name");
		String doctorName = request.getParameter("doctor_name");
		String appointmentDate = request.getParameter("appointment_date");
	    String appointmentTime = request.getParameter("appointment_time");
		
		
		TypedQuery<Patient> query = entityManager.createQuery("Select p from Patient p", Patient.class);
		List<Patient> patients = query.getResultList();

		for(Patient p:patients){
			
			patientDisease = p.getDisease();
		}
		
		TypedQuery<Doctor> query1 = entityManager.createQuery("Select d from Doctor d", Doctor.class);
		List<Doctor> doctors = query1.getResultList();
		
		for(Doctor d:doctors){
			specialization = d.getSpecialization();
			doctorFee = d.getFee();
		}
		
		Appointment appointment = new Appointment(patientName, doctorName, patientDisease, specialization,doctorFee, appointmentDate, appointmentTime);
		appointmentService.makeAppointment(appointment);
		return "redirect:appointment";

	}
	
	

}
