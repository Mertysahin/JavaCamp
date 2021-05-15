package overriding;

public class OgrenciKrediManager extends BaseKrediManager
{
	public double hesapla(double tutar)
	{
		return tutar * 1.10;
	}
/*override - hesapla metodu
 * base kredi managerdaki ayný imzaya sahipse eðer
	ogrenci icin burdakini calýstýrýr o metodun üstüne bu metodu yazar */
	
	/* eðer base kredi managerdaki metod final ile 
	  tanýlmansaydý bu metod onu ezemezdi üstüne yazamazdý */
}
