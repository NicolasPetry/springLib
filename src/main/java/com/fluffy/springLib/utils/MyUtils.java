package com.fluffy.springLib.utils;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Component
public class MyUtils {

	private static MessageSource messageSource;
	
	public MyUtils(MessageSource messageSource) {
		MyUtils.messageSource = messageSource;
	}
	
	public static void flash(RedirectAttributes redirectAttributes,
			String flashKind, String flashMessageCode) {
		
		redirectAttributes.addFlashAttribute("flashMessage", flashMessageCode);
		redirectAttributes.addFlashAttribute("flashKind", flashKind);
	}
}
