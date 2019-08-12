package com.sihatech.DMP.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Data;



@Data
@Entity
public class Patient extends Person {

	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="patient")
	private List<Consultation>consultations;
	
	private Integer socialSecurityNumber;
}
