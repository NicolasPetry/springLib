package com.fluffy.springLib.commands;

import com.fluffy.springLib.domains.Speciality;
import com.fluffy.springLib.validation.UniqueName;

public class SpecialityCommand {

	@UniqueName
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Speciality toSpeciality() {
		
		Speciality speciality = new Speciality();
		
		speciality.setName(name);
		
		return speciality;
	}
	
}
