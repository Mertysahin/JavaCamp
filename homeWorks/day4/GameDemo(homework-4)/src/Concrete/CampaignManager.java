package Concrete;

import Abstract.CampaingService;
import Entities.Campaign;

public class CampaignManager implements CampaingService
{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya olu�turuldu : " + campaign.getCampaingName() );
		
	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaingName() );
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi : " + campaign.getCampaingName() );
		
	}

}
