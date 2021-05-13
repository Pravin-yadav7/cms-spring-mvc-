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

import com.divergent.clinicspringmvc.entity.Drug;
import com.divergent.clinicspringmvc.service.DrugService;

@Controller
@RequestMapping("/drug")
public class DrugController {
	
	@Autowired
	DrugService drugService;
	
	
	public DrugController() {
		super();
	}

	@GetMapping
	protected ModelAndView showPage() {
		
		List<Drug> allDrug = drugService.findAll();
		ModelAndView model = new ModelAndView("Drug"); 
		model.addObject("allDrug", allDrug);
		return model;
		
	}

	@PostMapping
	protected String save(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int drugId = Integer.parseInt(request.getParameter("drug_id"));
		String drugName = request.getParameter("drug_name");
		String drugWeight = request.getParameter("drug_weight");
		String drugContent = request.getParameter("drug_content");
		String expiryDate = request.getParameter("expiryDate");
		String brandName = request.getParameter("brandName");
		Integer drugMRP = Integer.parseInt(request.getParameter("MRP"));
		
		Drug patient = new Drug(drugId, drugName, drugWeight, drugContent, expiryDate, brandName, drugMRP);
		drugService.insert(patient);
		return "redirect:/drug";

	}

	@GetMapping("/delete")
	protected String delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int drugId = Integer.parseInt(request.getParameter("drugId"));
		drugService.delete(drugId);
		return "redirect:/drug";
	
	}

}
