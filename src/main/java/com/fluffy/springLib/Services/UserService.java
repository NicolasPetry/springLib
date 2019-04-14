package com.fluffy.springLib.Services;

import org.springframework.boot.context.event.ApplicationReadyEvent;

import com.fluffy.springLib.commands.UserCommand;

public interface UserService {

	void signup(UserCommand userCommand);
	void afterApplicationReady(ApplicationReadyEvent event);

}
