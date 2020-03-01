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
	private Long id = null;
	
	private Long id_product;
	
	private Long id_user;
	
	private String status;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product")
    private Product product;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rating")
    private Rating rating;
	 
	
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
