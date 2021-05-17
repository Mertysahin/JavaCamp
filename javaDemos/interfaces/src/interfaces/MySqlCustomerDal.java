package interfaces;

public class MySqlCustomerDal implements ICustomerDal
{

	@Override
	public void add()
	{
		System.out.println("My Sql'e eklendi");
	}
	
}
