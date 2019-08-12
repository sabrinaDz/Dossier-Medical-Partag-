package com.sihatech.DMP.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.sihatech.DMP.model.referentials.Symptom;

public class Consultation extends BaseEntity{

	
	
	private Date date;
	private Patient patient;
	private Physician physician;
	private Set<Treatement>treatement=new HashSet<Treatement>();
	private Set<Symptom>symptoms=new HashSet<Symptom>();
}
