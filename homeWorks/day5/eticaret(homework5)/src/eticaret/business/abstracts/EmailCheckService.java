package eticaret.business.abstracts;

import eticaret.entities.concretes.User;

public interface EmailCheckService 
{
	public boolean isValidEmail(User user);
	public boolean isTheSameEmail(User user);
}
