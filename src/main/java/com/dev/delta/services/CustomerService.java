package com.dev.delta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Customer;
import com.dev.delta.repositories.CustomerRespository;

@Service
public class CustomerService {
	/**
	 * customerRepository
	 */
	@Autowired
	private CustomerRespository customerRepository;
	

	/**
	 * getCustomers
	 * @return
	 */
	public java.util.List<Customer> getCustomers()
	{
		return customerRepository.findAll();
	}
	
	/**
	 * getCount
	 * @return
	 */
	public long getCount()
	{
		return customerRepository.count();
	}

	/**
	 * save
	 * @param customer
	 */
	public void save(Customer customer)
	{
		customerRepository.save(customer);
	}

    /**
     * findById
     * @param id
     * @return
     */
	public Optional<Customer> findById(Long id) {
		return customerRepository.findById(id);
	}

	/**
	 * delete
	 * @param id
	 */
	public void delete(Long id) {
		customerRepository.delete(customerRepository.findById(id).get());
	}
}
