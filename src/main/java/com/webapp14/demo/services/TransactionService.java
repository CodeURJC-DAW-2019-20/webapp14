package com.webapp14.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* Este servicio se usará para incluir la funcionalidad que sea 
 * usada desde el BookRestController y el BookWebController
 */
@Service
public class TransactionService {

	@Autowired
	private TransactionRepository repository;

	public Optional<Transaction> findOne(long id) {
		return repository.findById(id);
	}
	
	public boolean exist(long id) {
		return repository.existsById(id);
	}

	public List<Transaction> findAll() {
		return repository.findAll();
	}

	public void save(Transaction transaction) {
		repository.save(transaction);
	}

	public void delete(long id) {
		repository.deleteById(id);
	}
}
