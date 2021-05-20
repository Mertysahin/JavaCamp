package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Sales;
import Entities.User;

public class SalesManager implements SalesService

{

	@Override
	public void Order(Sales sales, Game game, User user) {
		System.out.println("Sat�� ger�ekle�ti :" + "\n" +
				"Sat�� id:"+ sales.getSaleId()+ "\n" +
				"User id: " + user.getId() + "\n" +
				"Game id: " + game.getGameId()
				);
		
	}

	@Override
	public void CancelOrder(Sales sales, Game game, User user) {
		System.out.println("Sat�� iptal edildi :" + "\n" +
				"Sat�� id:"+ sales.getSaleId()+ "\n" +
				"User id: " + user.getId() + "\n" +
				"Game id: " + game.getGameId()
				);
		
	}

	@Override
	public void UpdateOrder(Sales sales, Game game, User user) {
		System.out.println("Sat�� g�ncellendi :" + "\n" +
				"Sat�� id:"+ sales.getSaleId()+ "\n" +
				"User id: " + user.getId() + "\n" +
				"Game id: " + game.getGameId()
				);
		
		
	}

	@Override
	public void CampaignSale(Sales sales, Game game, User user, Campaign campaign) 
	{
		System.out.println("Kampanya uyguland�:"+
				"\n" +
				"Sat�� id:"+ sales.getSaleId()+ "\n" +
				"Kampanya id : " + campaign.getCampaingId() + "\n" +
				"Kampanya ad� : " + campaign.getCampaingName() + "\n" +
				"User id: " + user.getId() + "\n" +
				"Game id: " + game.getGameId()
				
				);
		
	}

	
}


