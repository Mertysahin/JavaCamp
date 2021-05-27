package eticaret;

import javax.swing.JOptionPane;

import eticaret.business.concretes.UserCheckManager;
import eticaret.entities.concretes.User;

public class Utils
{
	public static void sendVerificationMail(User user)
	{
		System.out.println("Onaylama maili gönderildi : " + user.getEmail());
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
			JOptionPane.showMessageDialog(null,"Ad ve soyad en az 2 karakter olmalýdýr.");
			
		}
		if(!userCheckManager.isValidPassword(user))
		{
			JOptionPane.showMessageDialog(null,"Parola 6 karakterden olusturulmalýdýr");
			
		}
		if(!userCheckManager.isValidEmail(user))
		{
			JOptionPane.showMessageDialog(null,"Geçerli bir eposta adresi giriniz.");
			
		}
		if(!userCheckManager.isTheSameEmail(user))
		{
			JOptionPane.showMessageDialog(null,"Bu eposta adresi daha önce kullanýlmýþtýr.");
			
		}
		return false;
	}
	
	}
}
