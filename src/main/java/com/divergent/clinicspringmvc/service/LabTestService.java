package com.divergent.clinicspringmvc.service;

import java.util.List;

import com.divergent.clinicspringmvc.entity.LabTest;

public interface LabTestService {
	
	public void insert(LabTest labTest);

	public List<LabTest>findAll();

	public LabTest find(int testId);

	public void delete(int testId);
	

}
