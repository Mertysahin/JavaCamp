package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) 
	{
		
	
		int number = 1;
		boolean asal = true;		
		
		
		if(number==1)
		{
			System.out.println("Asal de�ildir");
			return;
		}
		if(number<1)
		{
			System.out.println("Ge�ersiz Say�");
			return;
		}
		
		for(int i=2; i<number; i++)
		{
			
			if(number % i==0)
			{
				asal=false;
				break;
			
			}
			
			
		}
		if(asal==true)
		{
			System.out.println("Asald�r");
		}
		else 
		{
			System.out.println("Asal de�ildir");
		}
		
	}

}
