import java.time.LocalDate;
import Abstract.GameManager;
import Abstract.UserManager;
import Adapter.MernisService;
import Concrete.CampaignManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Sales;
import Entities.User;


public class Main {

	public static void main(String[] args) 
	{
		UserManager userManager = new UserManager(new MernisService());
		userManager.add(new User(1,"Mertcan","ÞAHÝN","50824649794",LocalDate.of(1998, 07, 30)));
		
		System.out.println("-------------------------");
		
		GameManager gameManager = new GameManager();
		gameManager.add(new Game(1,"Days Gone", 279));
		
		System.out.println("-------------------------");
		
		SalesManager salesManager = new SalesManager();
		salesManager.Order(new Sales(1),new Game(1,"Days Gone", 279),new User(1,"Mertcan","ÞAHÝN","50824649794",LocalDate.of(1998, 07, 30)));
		
		System.out.println("-------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(new Campaign(1, "%10 indirim", "Yaz indirimi", 10));
		
		System.out.println("-------------------------");
		
		salesManager.CampaignSale
			(
					
				new Sales(2),
				new Game(1,"Days Gone", 279),
				new User(1,"Mertcan","ÞAHÝN","50824649794",LocalDate.of(1998, 07, 30)),
				new Campaign(1, "%10 indirim", "Yaz indirimi", 10)

				);
		
		
		
		
		
	}

}
