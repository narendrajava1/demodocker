package com.example.demodocker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "animaltype")
public class AnimalType {

	@Id
	@GeneratedValue
	private Long id;
	private Boolean meetPurpose;
	private Boolean milkPurpose;
}
