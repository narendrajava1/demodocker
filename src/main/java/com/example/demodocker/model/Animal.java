package com.example.demodocker.model;

import java.time.ZonedDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@MappedSuperclass
@Data
public class Animal {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	@CreationTimestamp
	private ZonedDateTime createdDateTime;
	@UpdateTimestamp
	private ZonedDateTime updatedDateTime;

//  @OneToMany(cascade = CascadeType.ALL)
//  private List<Phone> phones;
//    .............
}