package com.sihatech.DMP.model.referentials;

import javax.persistence.MappedSuperclass;

import javax.persistence.Entity;

import lombok.Data;

import com.sihatech.DMP.model.BaseEntity;


@Data
@MappedSuperclass
public class ReferalEntity extends BaseEntity{
	
	private String label;

}
