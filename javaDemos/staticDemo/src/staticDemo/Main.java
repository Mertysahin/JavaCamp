package staticDemo;

public class Main {

	public static void main(String[] args)
	{
		
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.price=10.0;
		product.name="";
		productManager.add(product);
		
		DatabaseHelper.Crud.Delete(); //bu yapý önerilmez
		
	}

}
