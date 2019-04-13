package com.fluffy.springLib.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String>{

	@Override
	public void initialize(Password arg0) {
		
	}
	public boolean isValid(String password, ConstraintValidatorContext context) {
       
        return false;
    }

}
