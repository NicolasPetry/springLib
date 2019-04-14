package com.fluffy.springLib.Services;

import com.fluffy.springLib.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fluffy.springLib.commands.UserCommand;
import com.fluffy.springLib.domains.User;
import com.fluffy.springLib.domains.User.Role;

@Service("userService")
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;

	@Value("${application.admin.email}")
	private String adminEmail;
	
	@Value("${application.admin.firstName}")
	private String adminFirstName;
	
	@Value("${application.admin.surname}")
	private String adminSurname;
	
	@Value("${application.admin.password}")
	private String adminPassword;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	@EventListener
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void afterApplicationReady(ApplicationReadyEvent event) {
		
		User user = new User();
		
		if(!userRepository.findByEmail("nicolas.petry@yahoo.fr").isPresent()) {
			user.setEmail(adminEmail);
			user.setFirstName(adminFirstName);
			user.setSurname(adminSurname);
			user.setPassword(adminPassword);
			user.getRoles().add(Role.ADMIN);
			
			userRepository.save(user);
		}
		
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public void signup(UserCommand userCommand) {
		
		User user = userCommand.toUser();
		user.getRoles().add(Role.UNVERIFIED);
		
		userRepository.save(user);
		
	}

	

}
