package Abstract;
import Entities.User;

public class UserManager implements UserService
{
	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
	
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user)
	{
		if(userCheckService.CheckIfRealPerson(user))
		{
			 System.out.println("Kullanýcý eklendi " + user.getFirstName());

		}
		else
		{
			System.out.println("Not a valid person");
		}
	}
	
	public void remove(User user)
	{
		System.out.println("Kullanýcý eklendi " + user.getFirstName());
	}
	public void update(User user)
	{
		System.out.println("Kullanýcý eklendi " + user.getFirstName());
	}
}
