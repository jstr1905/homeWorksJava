package Concrete;

import Abstract.CustomerManager;
import Abstract.ICustomerCheckServices;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {

	private ICustomerCheckServices customerCheckServices;

	public StarbucksCustomerManager(ICustomerCheckServices customerCheckServices) {
		super();
		this.customerCheckServices = customerCheckServices;
	}

	public void save(Customer customer) {
		if (customerCheckServices.checkIfRealPerson(customer)) {

			super.save(customer);

		} else {
			try {
				throw new Exception(customer.getFirstName() + " " + customer.getLastName() + " Not a valid person");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}
}
