package com.fluffy.springLib.commands;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fluffy.springLib.validation.Password;


public class UserCommand {

	@NotBlank(message="{blankField}")
	@Size(min=2, max=50, message="{firstNameSizeError}")
	private String firstName;
	
	@NotBlank(message="{blankField}")
	@Size(min=2, max=50, message="{sizeError}")
	private String surname;
	
	@NotBlank(message="{blankField}")
	@Size(min=2, max=100, message="{sizeError}")
	private String address;
	
	@NotBlank(message="{blankField}")
	@Size(min=2, max=10, message="{sizeError}")
	private String zipCode;
	
	@NotBlank(message="{blankField}")
	@Size(min=2, max=100, message="{sizeError}")
	private String town;
	
	@NotBlank(message="{blankEmail}")
	@Size(min=6, max=100, message="{emailSizeError}")
	private String email;
	
	@Password
	private String password;
	
	@NotBlank(message="{blankField}")
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
	
	
}
