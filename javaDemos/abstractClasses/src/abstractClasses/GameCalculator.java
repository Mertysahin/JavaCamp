package abstractClasses;

public abstract class GameCalculator 
/*abstract sýnýf mainde newlenemez , newlenirse içerisindeki opersyonlarýn hepsi orda kullanýlmalý gizli base bir sýnýf gibi*/ 
/*bu sýnýfý inherit eden sýnýflar bu sýnýftaki abstract metodlarýný implement etmeyi zorunlu kýlar*/
{
	public abstract void hesapla(); /*inherit eden bütün sýnýflar override edip bu metodu kullanmak zorunda*/
	
	public final void gameOver() /*final ileoverride edilemez tüm inherit sýnýflar bu þekilde kullanýr*/
	{
		System.out.println("Oyun bitti."); 
	}
}
