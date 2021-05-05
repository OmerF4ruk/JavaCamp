package Concrete;

import Abstract.IOrderService;
import Entities.Order;

public class OrderManager implements IOrderService{

	@Override
	public void buy(Order order) {
		System.out.println("Sipariþ Id: "+order.getOrderId());
		System.out.println("Satýn Alan : "+order.getUser().getFirstName()+" "+order.getUser().getLastName());
		System.out.println("Oyun Adý: "+order.getGame().getName());
		System.out.println("Fiyat: "+order.getGame().getPrice());
		System.out.println("Ýndirim Adý: "+order.getCampaign().getCampaignName());
		System.out.println("Ýndirim Oraný(%): "+order.getCampaign().getDiscount());
		System.out.println("Ýndirimli Fiyat: "+ order.getCampaign().getPriceAfterDiscount());
		System.out.println("SATIN ALINDI.");
		
	}

}
