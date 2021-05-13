package com.divergent.clinicspringmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.divergent.clinicspringmvc.entity.Drug;

@Repository
public class DrugDaoImpl implements BaseDao<Drug> {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void insert(Drug drug) {
		
		entityManager.persist(drug);
	}

	@Override
	public Drug find(int id) {
		
		Drug drug = entityManager.find(Drug.class, id);
		entityManager.close();
		return drug;
	}

	@Override
	public List<Drug> findAll() {
		
		TypedQuery<Drug> query = entityManager.createQuery("Select d from Drug d", Drug.class);
		List<Drug> drugs = query.getResultList();
		entityManager.close();
		return drugs;
	}

	@Override
	public void remove(int id) {
		
		Drug drug = entityManager.find(Drug.class, id);
		if (drug != null) {

			entityManager.remove(drug);
			entityManager.close();
		}
		
	}

}
