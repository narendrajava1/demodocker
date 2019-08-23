package com.example.demodocker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodocker.model.Cow;

public interface CowRepository extends JpaRepository<Cow, Long> {

}
