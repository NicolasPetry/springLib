package com.fluffy.springLib.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fluffy.springLib.domains.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByEmail(String email);
}
