package interfaces;

public class Utils 
{
	public static void runLoggers(Logger[] loggers, String message)
	{
		
		for(Logger logger : loggers)
		{
			logger.log(message);
		}
	}
	
	/*nesneyi newlemek yerine static kullan�rsak metodu direkt .metod �eklinde
	nesneyi olu�turmadan bu �ekilde statik yap�da kullanabiliriz -CustomerManager'da
	
	Bellekte 1 tane newler olu�turur uygulamay� kapayana kadar belekkte durur.
	Bellek i�in pahal�d�r. Her s�n�f i�in operasyonu i�in kullan�lmaz.
	
	inner claslarda statik tan�mlanabilir.
	
	public class S�n�f
		...	
		...
		
		public static class innerClass
	*/
}
