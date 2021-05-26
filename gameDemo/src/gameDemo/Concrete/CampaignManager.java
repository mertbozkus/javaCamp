package gameDemo.Concrete;

import gameDemo.Abstract.ICampaignService;
import gameDemo.Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Kampanya eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Kampanya guncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Kampanya silindi.");
		
	}

	
}
