package com.sihatech.DMP.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;



@Data
@Entity
public class Prescription extends BaseEntity{

	@OneToOne( mappedBy = "prescription", cascade = CascadeType.ALL,fetch = FetchType.LAZY   )
	private Consultation consultation;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="prescription")
	Set<Treatement>treatements=new HashSet<Treatement>();


}
