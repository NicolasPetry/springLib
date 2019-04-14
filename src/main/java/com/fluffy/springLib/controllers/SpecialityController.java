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

import com.fluffy.springLib.Services.SpecialityService;
import com.fluffy.springLib.commands.SpecialityCommand;
import com.fluffy.springLib.utils.MyUtils;

@Controller
@RequestMapping("/speciality")
public class SpecialityController {

	private SpecialityService specialityService;
	
	
	public SpecialityController(SpecialityService specialityService) {
		this.specialityService = specialityService;
	}

	@GetMapping
	public String speciality(Model model) {
		
		model.addAttribute("spec", new SpecialityCommand());
		return ("speciality");
	}
	
	@PostMapping
	public String createSpeciality(@Validated @ModelAttribute("spec") SpecialityCommand speciality,
			BindingResult result,
			RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) 
			return ("speciality");
	
		specialityService.createSpeciality(speciality);
		MyUtils.flash(redirectAttributes, "success", "Speciality created successfully");
		return "redirect:/";
	}
}
