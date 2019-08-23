package com.example.demodocker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cows")
public class Cow extends BaseEntity {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Long numberOfCattle;
	private Long age;
	private String breed;
	@ManyToOne
	@JoinColumn(name = "animal_type_id")
	private AnimalType animalType;

}
