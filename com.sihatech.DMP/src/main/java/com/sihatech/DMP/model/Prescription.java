package com.sihatech.DMP.model;

import java.util.HashSet;
import java.util.Set;

public class Prescription extends BaseEntity{
	
	
	private Consultation consultation;
	Set<Treatement>treatements=new HashSet<Treatement>();

}
