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
		userRepository.save(new User("JuanUser", "pass", "ROLE_USER"));
		userRepository.save(new User("PepeAdmin", "pass", "ROLE_USER", "ROLE_ADMIN"));
		
		//Sample products
		float product1Price  = 150;
		int product1Stock = 6;
		productRepository.save(new Product("Desktop A1795", "Windows 10 + i7 8700k + 1080 ti", product1Price, "desktop", "MSI", product1Stock));
		
		float product2Price  =  65;
		int product2Stock = 15;
		productRepository.save(new Product("Mouse 8558", "2000Dpi RGB", product2Price, "mice", "Corsair", product2Stock));
		
		//Sample transactions
		int transaction1IdProduct = 15884;
		int transaction1IdUser = 1322;
		transactionRepository.save(new Transaction(transaction1IdProduct, transaction1IdUser, "Shipped"));
		
		int transaction2IdProduct = 18655;
		int transaction2IdUser = 12588;
		transactionRepository.save(new Transaction(transaction2IdProduct, transaction2IdUser, "Issued"));
		
		//Sample ratings
		int rating1Rating = 5;
		int rating1IdTransaction = 15265;
		ratingRepository.save(new Rating(rating1Rating, rating1IdTransaction));
		
		int rating2Rating = 3;
		int rating2IdTransaction = 12358;
		ratingRepository.save(new Rating(rating2Rating, rating2IdTransaction));
				
	}

}
