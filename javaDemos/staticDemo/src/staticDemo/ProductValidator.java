package staticDemo;

public class ProductValidator
{
	
	static
	{
		System.out.println("Yapýcý statik blok çalýþtý.");
	}
	
	public ProductValidator()
	{
		System.out.println("Yapýcý blok çalýþtý.");
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
		/* bu metodu biyerde çaðýrabilmek için ilgili yerde new'lemek gerekir.*/
	}
	
	
	//inner class
	public static class BaskaBirClass
	{
		/*inner claslar static çalýþabilir*/
		
		public static void Sil()
		{
			
		}
	}
}
