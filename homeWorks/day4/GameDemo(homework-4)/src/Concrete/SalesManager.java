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
		System.out.println("Satýþ gerçekleþti :" + "\n" +
				"Satýþ id:"+ sales.getSaleId()+ "\n" +
				"User id: " + user.getId() + "\n" +
				"Game id: " + game.getGameId()
				);
		
	}

	@Override
	public void CancelOrder(Sales sales, Game game, User user) {
		System.out.println("Satýþ iptal edildi :" + "\n" +
				"Satýþ id:"+ sales.getSaleId()+ "\n" +
				"User id: " + user.getId() + "\n" +
				"Game id: " + game.getGameId()
				);
		
	}

	@Override
	public void UpdateOrder(Sales sales, Game game, User user) {
		System.out.println("Satýþ güncellendi :" + "\n" +
				"Satýþ id:"+ sales.getSaleId()+ "\n" +
				"User id: " + user.getId() + "\n" +
				"Game id: " + game.getGameId()
				);
		
		
	}

	@Override
	public void CampaignSale(Sales sales, Game game, User user, Campaign campaign) 
	{
		System.out.println("Kampanya uygulandý:"+
				"\n" +
				"Satýþ id:"+ sales.getSaleId()+ "\n" +
				"Kampanya id : " + campaign.getCampaingId() + "\n" +
				"Kampanya adý : " + campaign.getCampaingName() + "\n" +
				"User id: " + user.getId() + "\n" +
				"Game id: " + game.getGameId()
				
				);
		
	}

	
}


