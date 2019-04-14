package com.fluffy.springLib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fluffy.springLib.Services.UserService;
import com.fluffy.springLib.commands.UserCommand;
import com.fluffy.springLib.utils.MyUtils;

@Controller
@RequestMapping("/signup")
public class SignupController {
	
	private UserService userService;

	
	
	public SignupController(UserService userService) {
		this.userService = userService;
	}


	@GetMapping
	public String signup(Model model) {
		
		model.addAttribute("user", new UserCommand());
  		return("signup");
	}
	
	
	@PostMapping
	public String doSignup(@Validated @ModelAttribute("user") UserCommand user,
			BindingResult result,
			RedirectAttributes redirectAttributes) { 
		
		if(result.hasErrors()) {
			MyUtils.flash(redirectAttributes, "danger", "Sign up failed");
			return "signup";
		}
			
				
		userService.signup(user);
		MyUtils.flash(redirectAttributes, "success", "Sign up successful");
		
		return "redirect:/";	
		
	};
	
}