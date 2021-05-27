package eticaret.business.concretes;


import eticaret.business.abstracts.EmailCheckService;
import eticaret.business.abstracts.NameCheckService;
import eticaret.business.abstracts.PasswordCheckService;
import eticaret.entities.concretes.User;

import java.util.List;
import java.util.regex.Pattern;

public class UserCheckManager implements EmailCheckService,NameCheckService,PasswordCheckService
{
	private List<User> users;
	public UserCheckManager(List<User> users)
	{
		this.users=users;
	}
	
	@Override
	public boolean isValidPassword(User user) 
	{
		if((user.getParola().trim()).length()<6)
		{
		return  false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public boolean isTheSameEmail(User user) 
	{
		for (User user_ : users) {
			if (user_.getEmail().equals(user.getEmail())) 
			{
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isValidName(User user) {
		if((user.getFirstName().trim()).length()<2 && (user.getLastName().trim()).length()<=2)
		{
			return  false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public boolean isValidEmail(User user) 
	{
		final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
		
		if( pattern.matcher(user.getEmail()).find() == false)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
