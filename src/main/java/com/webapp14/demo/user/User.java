package com.webapp14.demo.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.webapp14.demo.services.Transaction;

/**
 * This is the entity to store in database user information. It contains the
 * following basic information:
 * <ul>
 * <li>name: The name of the user. This name have to be used to logIn into the
 * service</li>
 * <li>passwordHash: The hash of the password. The password in never stored in
 * plain text to avoid information leak</li>
 * <li>roles: The roles of this user</li>
 * 
 * To check if a user can be logged into the service, this object is loaded from
 * database and password is verified. If user is authenticated, then this
 * database object is returned to the user.
 * 
 * NOTE: This class is intended to be extended by developer adding new
 * attributes. Current attributes can not be removed because they are used in
 * authentication procedures.
 */

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String user_name;

	@JsonIgnore
	private String password;

	private String country;

	private String adress;

	private String post_code;

	private String city;

	private String credit_card_number;

	private String email;

	private String rol;
	
	@OneToMany
    private Set<Transaction> transaction;

	public User() {
	}
	
	public User(String user_name, String password, String... roles) {
		this.user_name = user_name;
		this.password = new BCryptPasswordEncoder().encode(password);
		this.rol = rol;
	}

	public String getName() {
		return user_name;
	}

	public void setName(String user_name) {
		this.user_name = user_name;
	}

	public String getPasswordHash() {
		return password;
	}

	public void setPasswordHash(String password) {
		this.password= password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol= rol;
	}

}