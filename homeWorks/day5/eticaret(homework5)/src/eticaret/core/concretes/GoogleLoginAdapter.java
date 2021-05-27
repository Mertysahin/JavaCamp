package eticaret.core.concretes;

import eticaret.GoogleLogin.GoogleLoginManager;
import eticaret.core.abstracts.GoogleLoginService;
import eticaret.entities.concretes.User;

public class GoogleLoginAdapter implements GoogleLoginService
{

	@Override
	public void signUp(User user) 
	{
		
		GoogleLoginManager googleLoginManager = new GoogleLoginManager();
		googleLoginManager.signUp(user);
		
	}

	@Override
	public void signIn(User user) 
	{
		
		GoogleLoginManager googleLoginManager = new GoogleLoginManager();
		googleLoginManager.signIn(user);
		
	}

	

}
