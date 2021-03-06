package com.fluffy.springLib.Services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fluffy.springLib.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	private UserRepository userRepository;
	
	
	public UserDetailsServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		return userRepository.findByEmail(username)
				.orElseThrow(() -> new UsernameNotFoundException(username));
	}

}
