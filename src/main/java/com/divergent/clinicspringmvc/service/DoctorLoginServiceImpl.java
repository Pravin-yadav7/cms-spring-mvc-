package com.divergent.clinicspringmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.divergent.clinicspringmvc.dao.DoctorLoginDao;
import com.divergent.clinicspringmvc.entity.Doctor;

public class DoctorLoginServiceImpl implements DoctorLoginService {

	@Autowired
	DoctorLoginDao doctorLoginDao;
	
	@Override
	public boolean login(String username, String password) {
		
		Doctor doctor = doctorLoginDao.login(username);
		if (doctor == null)
			return false;
		return username.equals(doctor.getName()) && password.equals(doctor.getEmail());
	}

}
