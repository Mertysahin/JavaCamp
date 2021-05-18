package Adapter;
import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Mernis implements ICustomerCheckService
{

	KPSPublicSoapProxy mernis = new KPSPublicSoapProxy();
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) 
	{
		boolean result = false;
		
		try
		{
			result = mernis.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());

		}
		catch (Exception e)
		{
			System.out.println("Not a valid person");
		}
		return result;
		
	}
	
}
