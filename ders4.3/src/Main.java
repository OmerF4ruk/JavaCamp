import java.time.LocalDate;

import Entities.Game;
import Entities.Order;
import Entities.User;
import Entities.Campaign;

import Abstract.ICampaignService;
import Abstract.IGameService;
import Abstract.IOrderService;
import Abstract.IUserService;

import Adapters.MernisServiceAdapter;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.UserManager;


public class Main {

	public static void main(String[] args) {
		
		IUserService userManager=new UserManager(new MernisServiceAdapter());
		User user= new User(1,"Ömer Faruk","Karaarslan","24421552498",LocalDate.of(1999, 12, 30));
		
		userManager.signUp(user);
		IGameService gameManager=new GameManager();
		Game game=new Game(34,"csgo",150);
		gameManager.add(game);
		
		ICampaignService campaignManager= new CampaignManager();
		Campaign campaign= new Campaign("0123",game,"csgo 50",50);
		campaignManager.add(campaign);
		System.out.println();
		
		IOrderService orderManager=new OrderManager();
		Order order= new Order(45,user,campaign);
		orderManager.buy(order);
		

	}

}
