package com.workingit.workingitprofession.service;

import java.util.List;

import com.workingit.workingitprofession.entity.Profession;

public interface IProfessionService {
	public Profession saveProfession (Profession profession);
	public List<Profession> getAll ();
}
