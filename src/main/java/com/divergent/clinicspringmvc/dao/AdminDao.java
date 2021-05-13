package com.divergent.clinicspringmvc.dao;

import com.divergent.clinicspringmvc.controller.*;
import com.divergent.clinicspringmvc.entity.Admin;

public interface AdminDao {
	
	public Admin login(String username);

}
