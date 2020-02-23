package com.webapp14.demo.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id = null;
	
	private Long rating;
	
	private Long id_transaction;
	
	public Rating() {}

	public Rating(Long rating, Long id_transaction) {
		super();
		this.rating = rating;
		this.id_transaction = id_transaction;
	}

	public Long getRating() {
		return rating;
	}

	public void setRating(Long rating) {
		this.rating = rating;
	}

	public Long getTransaction() {
		return id_transaction;
	}

	public void setTransaction(Long id_transaction) {
		this.id_transaction = id_transaction;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
