package com.divergent.clinicspringmvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.divergent.clinicspringmvc.entity.Patient;
import com.divergent.clinicspringmvc.service.PatientService;

@Controller
@RequestMapping("/patient")
public class PatientInsertController {

	@Autowired
	private PatientService patientService;

	public PatientInsertController() {
		super();
	}

	@GetMapping
	protected ModelAndView showPage() {
		
		List<Patient> allPatient = patientService.findAll();
		ModelAndView model = new ModelAndView("Patient"); 
		model.addObject("allPatient", allPatient);
		return model;
		
	}
	
	@PostMapping
	protected String save(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int patientId = Integer.parseInt(request.getParameter("patient_id"));
		String patientName = request.getParameter("patient_name");
		String address = request.getParameter("adddress");
		String patientDisease = request.getParameter("patient_disease");
		int patientAge = Integer.parseInt(request.getParameter("age"));
		long contactNumber = Long.parseLong(request.getParameter("contactNo"));
		
		Patient patient = new Patient(patientId, patientName, address, patientDisease, patientAge, contactNumber);
		patientService.insert(patient);
		return "redirect:/patient";

	}
	
	@GetMapping("/delete")
	protected String delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int patientId = Integer.parseInt(request.getParameter("patientId"));
		patientService.delete(patientId);
		return "redirect:/patient";
	
	}

}
