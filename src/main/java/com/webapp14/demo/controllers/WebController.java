package com.webapp14.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping(value={"", "/", "/home", "/index"})
	public String index(Model model) {
		return "index";
	}
	 
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping("/checkout")
	public String checkout(Model model) {
		return "checkout";
	}
	  
	@RequestMapping("/graphics")
	public String graphics(Model model) {
		return "graphics";
	}
	  
	@RequestMapping("/register")
	public String register(Model model) {
		return "register";
	}
}