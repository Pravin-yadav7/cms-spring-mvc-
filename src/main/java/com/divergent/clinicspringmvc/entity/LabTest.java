package com.divergent.clinicspringmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LabTest {

	
	@Id
	int testId;
	
	String testName;
	
	Integer testRate;

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Integer getTestRate() {
		return testRate;
	}

	public void setTestRate(Integer testRate) {
		this.testRate = testRate;
	}

	public LabTest() {
		
	}

	public LabTest(int testId, String testName, Integer testRate) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testRate = testRate;
	}
	
}
