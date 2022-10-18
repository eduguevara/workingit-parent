package com.workingit.workingitprofession.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.workingit.workingitprofession.entity.Profession;
import com.workingit.workingitprofession.repository.IProfessionRepository;

public class ProfessionServiceImpl implements IProfessionService{
	
	@Autowired
	IProfessionRepository repository;

	@Override
	public Profession saveProfession(Profession profession) {
		repository.save(profession);
		return profession;
	}

	@Override
	public List<Profession> getAll() {
		return repository.findAll();
	}

}
