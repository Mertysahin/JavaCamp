package eticaret.business.abstracts;

import eticaret.entities.concretes.User;

public interface PasswordCheckService 
{
	public boolean isValidPassword(User user);



}
