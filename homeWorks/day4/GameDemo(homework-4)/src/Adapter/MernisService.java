package Adapter;
import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements UserCheckService
{
	 KPSPublicSoapProxy mernis = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(User user)
	{

		boolean result = false;
		try
		{
			result=mernis.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName(), user.getLastName().toUpperCase(), user.getDateOfBirth().getYear());

		}
		catch(Exception e)
		{
			System.out.println("Not a valid person.");
		}
		return result;
	}
	 
	
}
