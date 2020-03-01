package com.webapp14.demo.services;


import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id = null;
	
	private String name;
	private String description;
	
	private Double price;
	
	private String category;
	private String brand;
	
	private Long stock;

	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_transaction")
    private Transaction transaction;
	
	public Product() {}

	public Product(String name, String description, double price, String category, String brand, Long stock) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
		this.brand = brand;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.name = category;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

}
