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

import com.divergent.clinicspringmvc.entity.Doctor;
import com.divergent.clinicspringmvc.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;

	public DoctorController() {
		super();
	}
	
	@GetMapping
	protected ModelAndView showPage() {
		
		List<Doctor> allDoctor = doctorService.findAll();
		ModelAndView model = new ModelAndView("Doctor"); 
		model.addObject("allDoctor", allDoctor);
		return model;
		
	}
	
	@PostMapping
	protected String save(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int doctorId = Integer.parseInt(request.getParameter("doctor_id"));
		String doctorName = request.getParameter("doctor_name");
		String email = request.getParameter("email");
		String degree = request.getParameter("degree");
		String specialization = request.getParameter("specialization");
		int doctorFee = Integer.parseInt(request.getParameter("doctor_fee"));
		String address = request.getParameter("address");
		long contactNumber = Long.parseLong(request.getParameter("contactNo"));
		
		Doctor doctor = new Doctor(doctorId, doctorName, email, degree,specialization, doctorFee, address,  contactNumber);
		doctorService.insert(doctor);
		return "redirect:/doctor";

	}

	
	@GetMapping("/delete")
	protected String delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int doctorId = Integer.parseInt(request.getParameter("doctorId"));
		doctorService.delete(doctorId);
		return "redirect:/doctor";
	
	}
}
