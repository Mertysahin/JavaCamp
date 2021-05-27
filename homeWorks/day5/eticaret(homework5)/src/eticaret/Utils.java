package eticaret;

import javax.swing.JOptionPane;

import eticaret.business.concretes.UserCheckManager;
import eticaret.entities.concretes.User;

public class Utils
{
	public static void sendVerificationMail(User user)
	{
		System.out.println("Onaylama maili g�nderildi : " + user.getEmail());
	}

	public static boolean userCheckInfo(User user, UserCheckManager userCheckManager)
	{
		
	if (userCheckManager.isTheSameEmail(user) && userCheckManager.isValidName(user) && userCheckManager.isValidPassword(user) 
			&& userCheckManager.isValidPassword(user) )
		
		{
		return true;
		
		}
	
	else
	{
		if(!userCheckManager.isValidName(user))
		{
			JOptionPane.showMessageDialog(null,"Ad ve soyad en az 2 karakter olmal�d�r.");
			
		}
		if(!userCheckManager.isValidPassword(user))
		{
			JOptionPane.showMessageDialog(null,"Parola 6 karakterden olusturulmal�d�r");
			
		}
		if(!userCheckManager.isValidEmail(user))
		{
			JOptionPane.showMessageDialog(null,"Ge�erli bir eposta adresi giriniz.");
			
		}
		if(!userCheckManager.isTheSameEmail(user))
		{
			JOptionPane.showMessageDialog(null,"Bu eposta adresi daha �nce kullan�lm��t�r.");
			
		}
		return false;
	}
	
	}
}
