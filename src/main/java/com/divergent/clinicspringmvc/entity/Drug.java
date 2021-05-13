package com.divergent.clinicspringmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drug {
	
	
	@Id
	int drugId;
	
	String drugName;
	
	String drugWeight;
	
	String drugContent;
	
	String expiryDate;
	
	String brandName;

	Integer drugMRP;

	public int getDrugId() {
		return drugId;
	}

	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugWeight() {
		return drugWeight;
	}

	public void setDrugWeight(String drugWeight) {
		this.drugWeight = drugWeight;
	}

	public String getDrugContent() {
		return drugContent;
	}

	public void setDrugContent(String drugContent) {
		this.drugContent = drugContent;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Integer getDrugMRP() {
		return drugMRP;
	}

	public void setDrugMRP(Integer drugMRP) {
		this.drugMRP = drugMRP;
	}

	public Drug() {
		
	}

	public Drug(int drugId, String drugName, String drugWeight, String drugContent, String expiryDate, String brandName,
			Integer drugMRP) {
		super();
		this.drugId = drugId;
		this.drugName = drugName;
		this.drugWeight = drugWeight;
		this.drugContent = drugContent;
		this.expiryDate = expiryDate;
		this.brandName = brandName;
		this.drugMRP = drugMRP;
	}
	
	

}
