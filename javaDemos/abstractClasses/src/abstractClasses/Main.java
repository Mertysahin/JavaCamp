package abstractClasses;

public class Main {

	public static void main(String[] args) 
	{
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		ManGameCalculator manGameCalculator = new ManGameCalculator();
		manGameCalculator.hesapla();
		
		GameCalculator gameCalculator = new WomanGameCalculator();
	}

}
