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

import com.divergent.clinicspringmvc.entity.LabTest;
import com.divergent.clinicspringmvc.service.LabTestService;

@Controller
@RequestMapping("/labTest")
public class LabTestController {
	
	@Autowired
	LabTestService labTestService;

	public LabTestController() {
		super();
	}
	
	@PostMapping
	protected String save(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int testId = Integer.parseInt(request.getParameter("test_id"));
		String testName = request.getParameter("test_name");
		int testRate = Integer.parseInt(request.getParameter("test_rate"));
		
		LabTest labTest = new LabTest(testId, testName, testRate);
		labTestService.insert(labTest);
		return "redirect:/labTest";

	}
	
	@GetMapping
	protected ModelAndView showPage() {
		
		List<LabTest> allLabTest = labTestService.findAll();
		ModelAndView model = new ModelAndView("LabTest"); 
		model.addObject("allLabTest", allLabTest);
		return model;
		
	}
	
	@GetMapping("/delete")
	protected String delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int labTestId = Integer.parseInt(request.getParameter("testId"));
		labTestService.delete(labTestId);
		return "redirect:/labTest";
	
	}


}
