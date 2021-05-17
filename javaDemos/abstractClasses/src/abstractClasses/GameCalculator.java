package abstractClasses;

public abstract class GameCalculator 
/*abstract s�n�f mainde newlenemez , newlenirse i�erisindeki opersyonlar�n hepsi orda kullan�lmal� gizli base bir s�n�f gibi*/ 
/*bu s�n�f� inherit eden s�n�flar bu s�n�ftaki abstract metodlar�n� implement etmeyi zorunlu k�lar*/
{
	public abstract void hesapla(); /*inherit eden b�t�n s�n�flar override edip bu metodu kullanmak zorunda*/
	
	public final void gameOver() /*final ileoverride edilemez t�m inherit s�n�flar bu �ekilde kullan�r*/
	{
		System.out.println("Oyun bitti."); 
	}
}
