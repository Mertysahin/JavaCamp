package classesWithAttribute;

public class Main {

	public static void main(String[] args) 
	{
		
		Product product = new Product();
	//	Product product = new Product(1,"Laptop","Asus Laptop",500.0,"mavi",6);
		
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000.0);
		product.setStockAmount(3);
		
		System.out.println(product.getKod());
	
		ProductManager productManager = new ProductManager();
		productManager.ProductAdd(product);
		

	}

}
