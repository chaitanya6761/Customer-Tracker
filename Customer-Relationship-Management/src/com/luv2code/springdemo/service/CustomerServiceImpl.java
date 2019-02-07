package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDao;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao CustomerDao;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return CustomerDao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		CustomerDao.saveCustomer(theCustomer);

	}

	@Override
	@Transactional
	public Customer getCustomre(int theId) {
		return CustomerDao.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomre(int theId) {
		CustomerDao.deleteCustomer(theId);
	}

}
