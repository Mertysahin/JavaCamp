package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager
{
	private ICustomerCheckService iCustomerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService)
	{
		this.iCustomerCheckService=iCustomerCheckService;
	}

	@Override
	public void save(Customer customer) 
	{
		if(iCustomerCheckService.CheckIfRealPerson(customer))
		{
			super.save(customer);
		}
		else
		{
			System.out.println("Not a valid person.");
		}
	}

	
	

}
