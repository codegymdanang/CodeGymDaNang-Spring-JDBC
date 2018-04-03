package codegymdanag.spring.dao;

import codegymdanag.spring.model.Customer;

public interface CustomerDAO {

	void insert(Customer customer);
	Customer findByCustomerFirstName(String firstName);
}
