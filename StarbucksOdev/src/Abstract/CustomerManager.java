package Abstract;

import Entities.Customer;

public abstract class CustomerManager implements ICustomerServices {
	public void save(Customer customer) {
		System.out.println("saved to db : " + customer.getFirstName() + " " + customer.getLastName());

	}
}
