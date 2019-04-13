package com.fluffy.springLib.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fluffy.springLib.validation.PasswordValidator;

@Constraint(validatedBy=PasswordValidator.class)
@NotBlank(message="{blankField}")
@Size(min=6, max=100, message="{sizeError}")
@Documented
@Retention(RUNTIME)
@Target({FIELD, ANNOTATION_TYPE})
public @interface Password {

	String message() default "{noMatch}";
	
	Class[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
