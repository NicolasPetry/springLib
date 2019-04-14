package com.fluffy.springLib.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fluffy.springLib.validation.UniqueNameValidator;

@Constraint(validatedBy=UniqueNameValidator.class)
@NotBlank(message="{blankField}")
@Size(min=2, max=250, message="{sizeError}")
@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface UniqueName {

String message() default "{duplicateName}";
	
	Class[] groups() default {};
	
	Class[] payload() default {};
}
