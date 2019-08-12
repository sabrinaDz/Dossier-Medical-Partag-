package com.sihatech.DMP.model;

import javax.persistence.Embeddable;

import lombok.Data;


@Embeddable
@Data
public class Adress {

	
	private String street;
	private String street2;
	private String city;
	private String postalCode;
}
