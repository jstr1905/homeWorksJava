package Main;

import java.time.LocalDate;

import Abstract.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer(1, "Yusuf", "Yýldýz", "23044374142", LocalDate.of(2000, 6, 30));
		CustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(customer1);

		CustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer1);

	}

}
