package loopDemo;

public class Main {

	public static void main(String[] args)
	{
		
	//FOR
		
		for(int i=1; i<10; i++)
		{
			System.out.println(i);
		}
		System.out.println("Döngü Bitti");
//////////////////////////////////////////////////
		
	//WHILE
		
	int i=1;
	while(i<10)
	{
		System.out.println(i);
		i+=2;
	}
	System.out.println("While Döngüsü Bitti");

	//DO - WHILE
	int j = 100;
		do 
		{
			System.out.println(j);
			j+=2;
		}
		while(j<10);
	System.out.println("While Döngüsü Bitti");
	
	}
}
