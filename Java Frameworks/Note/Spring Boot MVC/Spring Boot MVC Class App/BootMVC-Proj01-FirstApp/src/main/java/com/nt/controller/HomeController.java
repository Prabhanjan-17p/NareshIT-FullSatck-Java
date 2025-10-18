package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showWellPage() {
		System.out.println("HomeController.showHomePage()");
		return "wellcome";
	}
	
	@RequestMapping("/home")
	public String showHomePage() {
		System.out.println("HomeController.showHomePage()2");
		return "home";
	}
	
}
