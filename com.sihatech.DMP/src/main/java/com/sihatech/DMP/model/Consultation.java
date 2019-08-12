package com.sihatech.DMP.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

import com.sihatech.DMP.model.referentials.Symptom;

@Data
@Entity
public class Consultation extends BaseEntity{



    @Lob
    private String observations;
	
	 
	
	private Date date;
	
	@ManyToOne
	private Patient patient;
	
	@ManyToOne
	private Physician physician;
	
	
	
	@ManyToMany
	@JoinTable(name="consultation_symptoms",joinColumns=@JoinColumn(name="consultation_id"),
	inverseJoinColumns=@JoinColumn(name="symptom_id"))
	private Set<Symptom>symptoms=new HashSet<Symptom>();
	
	
	@OneToOne(cascade=CascadeType.ALL)
	private Prescription prescription;
	
}
