package com.fluffy.springLib.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="speciality", indexes = {
		@Index(columnList = "name", unique=true)
})
public class Speciality {

	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false, unique=true, length=100)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
