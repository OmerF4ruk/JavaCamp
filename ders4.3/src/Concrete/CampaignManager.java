package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println();
		int newPrice;
		newPrice= campaign.getGame().getPrice()-(campaign.getGame().getPrice()*campaign.getDiscount()/100);
		campaign.setPriceAfterDiscount(newPrice);	
		System.out.println(newPrice + " : indirim yansýtýldý.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi. ");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi. ");
		
		delete(campaign);
	}

}
