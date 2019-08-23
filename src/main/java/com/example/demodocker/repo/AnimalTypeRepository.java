package com.example.demodocker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodocker.model.AnimalType;

public interface AnimalTypeRepository extends JpaRepository<AnimalType, Long> {

}
