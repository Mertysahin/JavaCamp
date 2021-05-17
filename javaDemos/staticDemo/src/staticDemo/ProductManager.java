package staticDemo;

public class ProductManager 
{
	public void add(Product product)
	{
		
		/*isValid metodu static tanýmlandýðý için bu sýnýfýn
		 * içerisinde 1 kere oluþturuluyor ve burada newlenmeden
		 * kullanýlabiliyor.
		 * bir metodu static yaptýðýmýzda aþaðýdaki gibi class ismi ile direkt
		 * eriþilebilir
		 * Yapýcý blok staticte çalýþmaz sadece newleyince çalýþýr
		 * */
		
		if(ProductValidator.isValid(product))
		{
			System.out.println("Eklendi ");
		}
		else
		{
			System.out.println("Ürün bilgileri geçersizdir.");
		}
	}
}
