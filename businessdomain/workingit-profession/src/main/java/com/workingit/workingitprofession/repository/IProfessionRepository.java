package com.workingit.workingitprofession.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workingit.workingitprofession.entity.Profession;

public interface IProfessionRepository extends JpaRepository<Profession, Integer>{

}
