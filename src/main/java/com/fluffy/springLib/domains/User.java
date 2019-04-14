package com.fluffy.springLib.domains;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table (name="usr", indexes= {
		@Index(columnList = "email", unique=true)
})
public class User implements UserDetails{

	public static enum Role {
		UNVERIFIED, ADMIN, BLOCKED
	}
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false, length=100)
	private String firstName;
	
	@Column(nullable=false, length=100)
	private String surname;
	
	@Column(nullable=true, length=100)
	private String address;
	
	@Column(nullable=true, length=100)
	private String zipCode;
	
	@Column(nullable=true, length=100)
	private String town;
	
	@Column(nullable=false, length=250)
	private String email;

	@Column(nullable=false)
	private String password;

	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Collection<Role> roles = new HashSet<Role>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public Collection<Role> getRoles() {
	
		return roles;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	
		return roles.stream()
				.map(role -> new SimpleGrantedAuthority("ROLE_"+ role.name()))
				.collect(Collectors.toSet());
	}

	@Override
	public String getUsername() {

		return email;
	}

	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return true;
	}
	
	
}
