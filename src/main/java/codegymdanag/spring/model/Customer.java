package codegymdanag.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="Customer")
public class Customer {

	@Id
	private String id;
	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;


	@Column(name="age")
	private int age;



	@Column(name="address")
	private String address;
	
	public Customer() {
		
	}
	public Customer(String firstname, String lastname, int age, String address) {
	
		this.setFirstName(firstname);
		this.setLastName(lastname);
		this.setAge(age);
		this.setAddress(address);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
