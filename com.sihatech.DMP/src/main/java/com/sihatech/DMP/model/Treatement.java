package com.sihatech.DMP.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

import com.sihatech.DMP.model.referentials.Drug;

@Data
@Entity
public class Treatement extends BaseEntity {

	
	@ManyToOne
	private Drug drug;
	private Integer duration;
	
	@ManyToOne
	private Prescription prescription;
}
