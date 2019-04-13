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

import com.fluffy.springLib.commands.UserCommand;

@Controller
@RequestMapping("/signup")
public class SignupController {
	


	@GetMapping
	public String signup(Model model) {
		
		model.addAttribute("user", new UserCommand());
  		return("signup");
	}
	
	
	@PostMapping
	public String doSignup(@Validated @ModelAttribute("user") UserCommand user,
			BindingResult result) { 
		
		if(result.hasErrors())
			return "signup";
				
		return "redirect:/";	
		
	};
	
}