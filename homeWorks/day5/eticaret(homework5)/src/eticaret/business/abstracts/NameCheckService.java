package eticaret.business.abstracts;

import eticaret.entities.concretes.User;

public interface NameCheckService 
{
	public boolean isValidName(User user);

}
