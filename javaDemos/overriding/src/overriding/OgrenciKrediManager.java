package overriding;

public class OgrenciKrediManager extends BaseKrediManager
{
	public double hesapla(double tutar)
	{
		return tutar * 1.10;
	}
/*override - hesapla metodu
 * base kredi managerdaki ayn� imzaya sahipse e�er
	ogrenci icin burdakini cal�st�r�r o metodun �st�ne bu metodu yazar */
	
	/* e�er base kredi managerdaki metod final ile 
	  tan�lmansayd� bu metod onu ezemezdi �st�ne yazamazd� */
}
