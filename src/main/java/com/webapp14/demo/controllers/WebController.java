package com.webapp14.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp14.demo.user.UserComponent;

@Controller
public class WebController {

	@Autowired
    private UserComponent userComponent;
	
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
	
	@ModelAttribute
    public void addUserToModel(Model model){
        boolean logged = userComponent.getLoggedUser() != null;
        model.addAttribute("logged", logged);
        if(logged){
            model.addAttribute("admin",userComponent.getLoggedUser().getRoles().contains("ROLE_ADMIN"));
            model.addAttribute("user",userComponent.getLoggedUser().getRoles().contains("ROLE_USER"));
        }
    }
}