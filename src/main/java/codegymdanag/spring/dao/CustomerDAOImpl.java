package codegymdanag.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import codegymdanag.spring.model.Customer;

@Repository("customerDao")
@Transactional
public class CustomerDAOImpl implements CustomerDAO {

	@PersistenceContext
	private EntityManager pcManager;

	public void insert(Customer customer) {
		// TODO Auto-generated method stub

	}

	public Customer findByCustomerFirstName(String firstName) {
		Customer customer = (Customer) pcManager.createQuery("SELECT c FROM Customer c WHERE first_name = :firstName")
				.setParameter("firstName", firstName).getSingleResult();

		return customer;
	}

}
