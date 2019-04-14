package com.fluffy.springLib.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fluffy.springLib.domains.Speciality;

public interface SpecialityRepository extends JpaRepository<Speciality, Long>{
	
	Optional<Speciality> findByName(String name);


}
