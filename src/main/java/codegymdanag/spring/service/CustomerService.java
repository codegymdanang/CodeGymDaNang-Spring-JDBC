package codegymdanag.spring.service;

import codegymdanag.spring.model.Customer;

public interface CustomerService {

	Customer findByCustomerFirstName(String firstName);
}
