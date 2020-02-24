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
		
		//Sample products
		double product1Price  = new Double(1500.15);
		long product1Stock = new Long(6);
		productRepository.save(new Product("Desktop A1795", "Windows 10 + i7 8700k + 1080 ti", product1Price, "desktop", "MSI", product1Stock));
		
		Double product2Price  =  new Double(65.99);
		Long product2Stock = new Long(15);
		productRepository.save(new Product("Mouse 8558", "2000Dpi RGB", product2Price, "mice", "Corsair", product2Stock));
		
		//Sample transactions
		Long transaction1IdProduct = new Long (15884);
		Long transaction1IdUser = new Long(13225);
		transactionRepository.save(new Transaction(transaction1IdProduct, transaction1IdUser, "Shipped"));
		
		Long transaction2IdProduct = new Long (18655);
		Long transaction2IdUser = new Long(12588);
		transactionRepository.save(new Transaction(transaction2IdProduct, transaction2IdUser, "Issued"));
		
		//Sample ratings
		Double rating1Rating = new Double(5);
		Long rating1IdTransaction = new Long(15265);
		ratingRepository.save(new Rating(rating1Rating, rating1IdTransaction));
		
		Double rating2Rating = new Double(3.5);
		Long rating2IdTransaction = new Long(12358);
		ratingRepository.save(new Rating(rating2Rating, rating2IdTransaction));
				
	}

}
