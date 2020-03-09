package com.webapp14.demo.controllers;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp14.demo.user.User;
import com.webapp14.demo.user.UserComponent;

@Controller
public class LoginWebController {
	
	private static final Logger log = LoggerFactory.getLogger(LoginWebController.class);

	@Autowired
	private UserComponent userComponent;
	
	@RequestMapping("/login")
	public String login(Model model) {

		return "login";
	}

	@RequestMapping("/loginerror")
	public String loginerror(Model model) {
		return "loginerror";
	}

	@RequestMapping("/logIn")
	public ResponseEntity<User> logIn() {
		
		if (!userComponent.isLoggedUser()) {
			log.info("Not user logged");
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		} else {
			User loggedUser = userComponent.getLoggedUser();
			log.info("Logged as " + loggedUser.getName());
			return new ResponseEntity<>(loggedUser, HttpStatus.OK);
		}
	}
	
	@RequestMapping("/logOut")
	public ResponseEntity<Boolean> logOut(HttpSession session) {

		if (!userComponent.isLoggedUser()) {
			log.info("No user logged");
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		} else {
			session.invalidate();
			log.info("Logged out");
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
	}

	

}