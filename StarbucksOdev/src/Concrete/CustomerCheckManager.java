package Concrete;

import Abstract.ICustomerCheckServices;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckServices {

	public boolean checkIfRealPerson(Customer customer) {

		return true;

	}

}
