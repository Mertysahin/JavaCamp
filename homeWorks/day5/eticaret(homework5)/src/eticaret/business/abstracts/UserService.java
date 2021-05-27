package eticaret.business.abstracts;
import java.util.List;

import eticaret.entities.concretes.User;

public interface UserService 
{
	public void add(User user);
	public void remove(User user);
	public void update(User user);
	List<User>getAll();
}
