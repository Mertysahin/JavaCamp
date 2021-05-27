
package eticaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import eticaret.business.concretes.UserCheckManager;
import eticaret.dataAccess.abstracts.UserDao;
import eticaret.entities.concretes.User;
import eticaret.Utils;

public class UserManagerDao implements UserDao



{

	private List<User> users = new ArrayList<User>();
	UserCheckManager userCheckManager = new UserCheckManager(users);

	@Override
	public void add(User user) 
	{

		if(Utils.userCheckInfo(user, userCheckManager))
		{
			if(!userCheckManager.isTheSameEmail(user))
			{
				System.out.println("Bu mail ile zaten bir hesap olusturulmustur.");
				delete(user);
			}
			else
			{
				System.out.println("Hesap olusturuldu");
				users.add(user);
				Utils.sendVerificationMail(user);
				
			}
		}
		else
		{
			System.out.println("Bilgilerinizi kontrol ediniz");
		}
		
	}

	@Override
	public void delete(User user) {
		
		System.out.println("User \"" + user.getFirstName() + "\" silindi .");
		
	}

	@Override
	public void login(String email, String password) {
		
		for (User user_ : users) {
			if (user_.getEmail().equals(email) && user_.getParola() == password) {
				System.out.println("Tekrar Hoþgeldiniz " + user_.getFirstName() + " " + user_.getLastName()
						+ ".Baþarý ile giriþ yapýldý.\n\n");
				return;
			}
		}
		System.out.println("Giriþ baþarýsýz bilgilerinizi kontrol ediniz");
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
