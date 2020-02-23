package com.webapp14.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* Este servicio se usará para incluir la funcionalidad que sea 
 * usada desde el BookRestController y el BookWebController
 */
@Service
public class RatingService {

	@Autowired
	private RatingRepository repository;

	public Optional<Rating> findOne(long id) {
		return repository.findById(id);
	}
	
	public boolean exist(long id) {
		return repository.existsById(id);
	}

	public List<Rating> findAll() {
		return repository.findAll();
	}

	public void save(Rating rating) {
		repository.save(rating);
	}

	public void delete(long id) {
		repository.deleteById(id);
	}
}
