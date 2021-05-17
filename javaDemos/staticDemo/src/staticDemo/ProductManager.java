package staticDemo;

public class ProductManager 
{
	public void add(Product product)
	{
		
		/*isValid metodu static tan�mland��� i�in bu s�n�f�n
		 * i�erisinde 1 kere olu�turuluyor ve burada newlenmeden
		 * kullan�labiliyor.
		 * bir metodu static yapt���m�zda a�a��daki gibi class ismi ile direkt
		 * eri�ilebilir
		 * Yap�c� blok staticte �al��maz sadece newleyince �al���r
		 * */
		
		if(ProductValidator.isValid(product))
		{
			System.out.println("Eklendi ");
		}
		else
		{
			System.out.println("�r�n bilgileri ge�ersizdir.");
		}
	}
}
