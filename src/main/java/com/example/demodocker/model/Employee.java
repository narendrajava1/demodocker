package com.example.demodocker.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class Employee {
	@Id
	@GeneratedValue
	private long id;
	private String name;

//  @OneToMany(cascade = CascadeType.ALL)
//  private List<Phone> phones;
//    .............
}