package com.divergent.clinicspringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergent.clinicspringmvc.dao.BaseDao;
import com.divergent.clinicspringmvc.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	BaseDao<Patient> patientDao;
	
	@Transactional
	@Override
	public void insert(Patient patient) {
		
		patientDao.insert(patient);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Patient> findAll() {
		
		return patientDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Patient find(int patientId) {
		
		return patientDao.find(patientId);
	}

	@Transactional
	@Override
	public void delete(int patientId) {
		
		patientDao.remove(patientId);
		
	}

}
