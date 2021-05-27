package eticaret;

import eticaret.core.concretes.GoogleLoginAdapter;
import eticaret.dataAccess.abstracts.UserDao;
import eticaret.dataAccess.concretes.UserManagerDao;
import eticaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) 
	{
		
		UserDao userDao = new UserManagerDao();
		GoogleLoginAdapter googleLoginAdapter = new GoogleLoginAdapter();
		
		User user1 = new User(1,"Mertcan","ÞAHÝN","merty1304@gmail.com","656565");
		userDao.add(user1);
		userDao.login("merty1304@gmail.com", "656565");
		
		User user2 = new User(2,"Engin", "Demirog","engin@gmail.com", "engin12"); //google sign up & login sample
		googleLoginAdapter.signUp(user2);
		userDao.add(user2);
		googleLoginAdapter.signIn(user2);
	
	}

}
