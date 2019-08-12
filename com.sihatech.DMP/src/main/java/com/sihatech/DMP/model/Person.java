package com.sihatech.DMP.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import lombok.Data;



@Data
@MappedSuperclass
public class Person extends BaseEntity{
	
	
	@Embedded
	private Adress adress;
}
