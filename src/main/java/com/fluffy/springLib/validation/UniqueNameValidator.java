package com.fluffy.springLib.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.fluffy.springLib.repositories.SpecialityRepository;

@Component
public class UniqueNameValidator implements ConstraintValidator<UniqueName, String>{

	private SpecialityRepository specialityRepository;
	
	public UniqueNameValidator(SpecialityRepository specialityRepository) {
		this.specialityRepository = specialityRepository;
	}

	
	@Override
	public boolean isValid(String name, ConstraintValidatorContext arg1) {
	
		return !specialityRepository.findByName(name).isPresent();}

}
