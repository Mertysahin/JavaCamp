

public class UserManager
{
		
	public void signIn(User user) 
	{
		System.out.println("User Name: " + user.getUserName() + "\n" +"User Password: "+ user.getUserPassword()+ "\n");
		System.out.println("Kullan�c� ba�ar� ile giri� yapt� " + "\n");

	}
	public void signOut(User user) 
	{
		System.out.println("User Name: " + user.getUserName() + "\n" +"User Password: "+ user.getUserPassword()+ "\n");
		System.out.println("Kullan�c� ba�ar� ile ��k�� yapt� " + "\n");

	}
	
	public void add(User user)
	{
		
		System.out.println("Kullan�c� Eklendi: "+ user.getUserName());
	}
	public void remove(User user)
	{
		
		System.out.println("Kullan�c� Silindi: "+ user.getUserName());
	}
	
		
	}


