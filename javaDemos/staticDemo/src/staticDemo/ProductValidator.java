package staticDemo;

public class ProductValidator
{
	
	static
	{
		System.out.println("Yap�c� statik blok �al��t�.");
	}
	
	public ProductValidator()
	{
		System.out.println("Yap�c� blok �al��t�.");
	}
	
	public static boolean isValid(Product product)
	{
		if(product.price>0 && !product.name.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void bisey()
	{
		/* bu metodu biyerde �a��rabilmek i�in ilgili yerde new'lemek gerekir.*/
	}
	
	
	//inner class
	public static class BaskaBirClass
	{
		/*inner claslar static �al��abilir*/
		
		public static void Sil()
		{
			
		}
	}
}
