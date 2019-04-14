package com.fluffy.springLib.commands;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fluffy.springLib.domains.User;
import com.fluffy.springLib.validation.Password;
import com.fluffy.springLib.validation.UniqueEmail;


public class UserCommand {

	@NotBlank(message="{blankField}")
	@Size(min=2, max=50, message="{firstNameSizeError}")
	private String firstName;
	
	@NotBlank(message="{blankField}")
	@Size(min=2, max=50, message="{sizeError}")
	private String surname;
	
	private String address;
	
	private String zipCode;
	
	private String town;
	
	@UniqueEmail
	private String email;
	
	@Password
	private String password;
	
	private String password2;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	
	public User toUser() {
		
		User user = new User();
		
		user.setFirstName(firstName);
		user.setSurname(surname);
		user.setAddress(address);
		user.setZipCode(zipCode);
		user.setTown(town);
		user.setEmail(email);
		user.setPassword(password);
		
		return user;
		
	}
}
