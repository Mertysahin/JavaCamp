import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.Mernis;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) 
	{
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new Mernis());
		baseCustomerManager.save(new Customer(1, "Mertcan", "ÞAHÝN", LocalDate.of(1998, 07, 30), "55555555"));
	}

}
