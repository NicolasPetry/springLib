package com.fluffy.springLib.Services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fluffy.springLib.commands.SpecialityCommand;
import com.fluffy.springLib.domains.Speciality;
import com.fluffy.springLib.repositories.SpecialityRepository;

@Service("specialityService")
public class SpecialityServiceImpl implements SpecialityService{

	private SpecialityRepository specialityRepository;
	
	
	public SpecialityServiceImpl(SpecialityRepository specialityRepository) {
		super();
		this.specialityRepository = specialityRepository;
	}


	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void createSpeciality(SpecialityCommand specialityCommand) {
		
		Speciality speciality = specialityCommand.toSpeciality();
		
		specialityRepository.save(speciality);
		
	}

}
