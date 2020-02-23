package com.webapp14.demo.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id = null;
	
	private Long id_product;
	
	private Long id_user;
	
	private String status;

	public Transaction() {}

	public Transaction(Long id_product, Long id_user, String status) {
		super();
		this.id_product = id_product;
		this.id_user = id_user;
		this.status = status;
	}

	public Long getProduct() {
		return id_product;
	}

	public void setProduct(Long id_product) {
		this.id_product = id_product;
	}

	public Long getUser() {
		return id_user;
	}

	public void setUser(Long id_user) {
		this.id_user = id_user;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

}
