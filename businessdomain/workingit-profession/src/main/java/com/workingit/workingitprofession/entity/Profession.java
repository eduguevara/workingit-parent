package com.workingit.workingitprofession.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "professions")
public class Profession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String description;

}
