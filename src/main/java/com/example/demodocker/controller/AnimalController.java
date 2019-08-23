package com.example.demodocker.controller;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demodocker.model.AnimalType;
import com.example.demodocker.model.Cow;
import com.example.demodocker.model.ServiceResponse;
import com.example.demodocker.repo.AnimalTypeRepository;
import com.example.demodocker.repo.CowRepository;

@RestController
@RequestMapping("/animal")
public class AnimalController {
	@Autowired
	private CowRepository cowRepository;
	@Autowired
	private AnimalTypeRepository animalTypeRepository;

	Long id = NumberUtils.LONG_ZERO;

	@PostMapping("/saveorupdate/cows")
	private ServiceResponse<Long> saveCows(@RequestBody Cow cow) {
		final ServiceResponse<Long> response = new ServiceResponse<>();
		cowRepository.findById(cow.getId()).ifPresent(cowEntity -> {
			final AnimalType animalType = new AnimalType();
			cowEntity.setAge(cow.getAge());
			animalType.setMeetPurpose(false);
			animalType.setMilkPurpose(true);
			cowEntity.setAnimalType(animalType);
			cowEntity.setBreed(StringUtils.EMPTY);
			cowEntity.setName(StringUtils.EMPTY);
			cowEntity.setNumberOfCattle(NumberUtils.LONG_ZERO);
			animalTypeRepository.save(animalType);
			id = cowRepository.save(cowEntity).getId();
		});
		id = cowRepository.save(cow).getId();
		response.setData(id);
		return response;

	}

}
