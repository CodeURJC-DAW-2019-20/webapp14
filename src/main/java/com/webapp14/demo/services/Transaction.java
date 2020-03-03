package com.webapp14.demo.services;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.webapp14.demo.user.User;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int id_product;
	
	private int id_user;
	
	private String status;

	@ManyToOne
    private User user;
	
	@OneToOne
    private Product product;
	
	@OneToOne
    private Rating rating;
	 
	
	public Transaction() {}

	public Transaction(int id_product, int id_user, String status) {
		super();
		this.id_product = id_product;
		this.id_user = id_user;
		this.status = status;
	}

	public int getProduct() {
		return id_product;
	}

	public void setProduct(int id_product) {
		this.id_product = id_product;
	}

	public int getUser() {
		return id_user;
	}

	public void setUser(int id_user) {
		this.id_user = id_user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

}
