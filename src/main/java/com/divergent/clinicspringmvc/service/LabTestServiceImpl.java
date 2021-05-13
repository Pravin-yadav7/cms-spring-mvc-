package com.divergent.clinicspringmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.divergent.clinicspringmvc.dao.BaseDao;
import com.divergent.clinicspringmvc.entity.LabTest;

@Service
public class LabTestServiceImpl implements LabTestService {

	@Autowired
	BaseDao<LabTest> labTestDao;
	
	@Transactional
	@Override
	public void insert(LabTest labTest) {
		
		labTestDao.insert(labTest);	
	}

	@Transactional(readOnly = true)
	@Override
	public List<LabTest> findAll() {
		
		return labTestDao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public LabTest find(int testId) {
		
		return labTestDao.find(testId);
	}

	@Transactional
	@Override
	public void delete(int testId) {
		
		labTestDao.remove(testId);
		
	}
	
	

}
