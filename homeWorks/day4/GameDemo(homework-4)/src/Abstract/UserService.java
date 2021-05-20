package Abstract;
import Entities.User;

public interface UserService
{
	void add(User user);
	void remove(User user);
	void update(User user);
}
