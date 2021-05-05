package Entities;

import Abstract.IEntity;

public class Campaign implements IEntity {
	private String campaignCode;
	private Game game;
	private String campaignName;
	private int discount;
	private int priceAfterDiscount;
	
	public Campaign(String campaignCode, Game game, String campaignName, int discount) {
		super();
		this.campaignCode = campaignCode;
		this.game = game;
		this.campaignName = campaignName;
		this.discount = discount;
	}
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getPriceAfterDiscount() {
		return priceAfterDiscount;
	}
	public void setPriceAfterDiscount(int priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
	}
	
	
	

}
