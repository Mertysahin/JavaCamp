package eticaret.business.concretes;
import java.util.List;

import javax.swing.JOptionPane;
import eticaret.business.abstracts.UserService;
import eticaret.entities.concretes.User;

public class UserManager implements UserService

 
{
	
	@Override
	public void add(User user)
	{
		
			System.out.println("Kullan�c� Eklendi");
		
		
	}

	@Override
	public void remove(User user) {
	
		
			System.out.println("Kullan�c� silindi");
			
	
		
		
	}

	@Override
	public void update(User user) {

	
			System.out.println("Kullan�c� g�ncellendi");
	
	
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
