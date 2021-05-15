

public class UserManager
{
		
	public void signIn(User user) 
	{
		System.out.println("User Name: " + user.getUserName() + "\n" +"User Password: "+ user.getUserPassword()+ "\n");
		System.out.println("Kullanýcý baþarý ile giriþ yaptý " + "\n");

	}
	public void signOut(User user) 
	{
		System.out.println("User Name: " + user.getUserName() + "\n" +"User Password: "+ user.getUserPassword()+ "\n");
		System.out.println("Kullanýcý baþarý ile çýkýþ yaptý " + "\n");

	}
	
	public void add(User user)
	{
		
		System.out.println("Kullanýcý Eklendi: "+ user.getUserName());
	}
	public void remove(User user)
	{
		
		System.out.println("Kullanýcý Silindi: "+ user.getUserName());
	}
	
		
	}


