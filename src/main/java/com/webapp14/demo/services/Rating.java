package com.webapp14.demo.services;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Rating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int rating;
	
	private int id_transaction;
	
	@OneToOne
    private Transaction transaction;
	
	public Rating() {}

	public Rating(int rating, int id_transaction) {
		super();
		this.rating = rating;
		this.id_transaction = id_transaction;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getTransaction() {
		return id_transaction;
	}

	public void setTransaction(int id_transaction) {
		this.id_transaction = id_transaction;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
