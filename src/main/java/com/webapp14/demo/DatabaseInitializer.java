package com.webapp14.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.webapp14.demo.services.Product;
import com.webapp14.demo.services.ProductRepository;
import com.webapp14.demo.services.Rating;
import com.webapp14.demo.services.RatingRepository;
import com.webapp14.demo.services.Transaction;
import com.webapp14.demo.services.TransactionRepository;
import com.webapp14.demo.user.User;
import com.webapp14.demo.user.UserRepository;

@Component
public class DatabaseInitializer {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private RatingRepository ratingRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void init() {

		// Sample users

		userRepository.save(new User("user", "pass", "ROLE_USER"));
		userRepository.save(new User("admin", "pass", "ROLE_USER", "ROLE_ADMIN"));
	}

}
