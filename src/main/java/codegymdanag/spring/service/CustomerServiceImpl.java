package codegymdanag.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codegymdanag.spring.dao.CustomerDAO;
import codegymdanag.spring.model.Customer;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	private CustomerDAO customerDao;
	
	
	public Customer findByCustomerFirstName(String firstName) {
		return customerDao.findByCustomerFirstName(firstName);
	}

	
}
