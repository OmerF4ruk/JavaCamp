package Entities;

public class Order {
	private int orderId;
	private User user;
	private Game game;
	private Campaign campaign;
	
	
	public Order(int orderId, User user, Campaign campaign) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.campaign = campaign;
		game=campaign.getGame();
	}
	public Order(int orderId, User user, Game game) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.game = game;
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int id) {
		this.orderId = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public Game getGame() {
		return game;
	}
	
	public void setGame(Game game) {
		this.game = game;
	}

}
