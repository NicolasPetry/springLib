package com.fluffy.springLib.domains;

import java.util.Collection;
import java.util.HashSet;

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

@Entity
@Table (name="user", indexes= {
		@Index(columnList = "email", unique=true)
})
public class User {

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
	
	@Column(nullable=false, length=100)
	private String address;
	
	@Column(nullable=false, length=100)
	private String zipCode;
	
	@Column(nullable=false, length=100)
	private String town;
	
	@Column(nullable=false, length=250)
	private String email;

	@Column(nullable=false)
	private String password;

	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Collection<Role> roles = new HashSet<Role>();
}
