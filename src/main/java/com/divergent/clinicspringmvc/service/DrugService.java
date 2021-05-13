package com.divergent.clinicspringmvc.service;

import java.util.List;

import com.divergent.clinicspringmvc.entity.Drug;

public interface DrugService {
	
	public void insert(Drug drug);

	public List<Drug>findAll();

	public Drug find(int drugId);

	public void delete(int drugId);

}
