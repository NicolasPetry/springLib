package com.fluffy.springLib.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.fluffy.springLib.repositories.UserRepository;
import com.fluffy.springLib.validation.UniqueEmail;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String>{

	private UserRepository userRepository;
	
	public UniqueEmailValidator(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public void initialize(UniqueEmail arg0) {
		
	}
	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		
		return !userRepository.findByEmail(email).isPresent();
	}

}
