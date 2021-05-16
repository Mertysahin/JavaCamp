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
	
	/*nesneyi newlemek yerine static kullanýrsak metodu direkt .metod þeklinde
	nesneyi oluþturmadan bu þekilde statik yapýda kullanabiliriz -CustomerManager'da
	
	Bellekte 1 tane newler oluþturur uygulamayý kapayana kadar belekkte durur.
	Bellek için pahalýdýr. Her sýnýf için operasyonu için kullanýlmaz.
	
	inner claslarda statik tanýmlanabilir.
	
	public class Sýnýf
		...	
		...
		
		public static class innerClass
	*/
}
