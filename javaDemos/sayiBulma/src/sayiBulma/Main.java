package sayiBulma;

public class Main {

	public static void main(String[] args)
	{
		int[] sayilar = {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi = false;
		for(int gecici : sayilar)
		{
			if(aranacak == gecici)
			{
				varMi=true;
				break;
			}			
			
		}
		if(varMi) 
		{
			System.out.println("Say� Mevcuttur");
		}
		else
		{
			System.out.println("Say� Yoktur");
		}
		
	}

}
