package oopIntro;

public class Main {

	public static void main(String[] args) 
	{
		
		
		Product product1 = new Product(1,"Lenovo V14",15000,"8GB RAM",10); //referans olusturma,instance olusturma
		
		System.out.println(product1.getName());
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo v15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getName());
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());


	}
	
}
