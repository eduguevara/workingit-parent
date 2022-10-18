package com.workingit.workingitprofession.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workingit.workingitprofession.entity.Profession;
import com.workingit.workingitprofession.repository.IProfessionRepository;

@RestController
@RequestMapping("/api")
public class ProfessionController {
	
	@Autowired
	IProfessionRepository professionRepository;
	
	@PostMapping("/profession")
	public ResponseEntity<?> saveProfession (@RequestBody Profession profession) {
		professionRepository.save(profession);
		return new ResponseEntity<>(profession, HttpStatus.OK);
	}
	
	@GetMapping("/profession")
	public ResponseEntity<?> getAllProfession () {
		List<Profession> professions = professionRepository.findAll();
		return new ResponseEntity<>(professions, HttpStatus.OK);
	}

}
