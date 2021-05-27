package eticaret.core.abstracts;

import eticaret.entities.concretes.User;

public interface GoogleLoginService 
{
	public void signUp(User user);
	public void signIn(User user);
}
