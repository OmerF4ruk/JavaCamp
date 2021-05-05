package Concrete;

import Abstract.IOrderService;
import Entities.Order;

public class OrderManager implements IOrderService{

	@Override
	public void buy(Order order) {
		System.out.println("Sipari� Id: "+order.getOrderId());
		System.out.println("Sat�n Alan : "+order.getUser().getFirstName()+" "+order.getUser().getLastName());
		System.out.println("Oyun Ad�: "+order.getGame().getName());
		System.out.println("Fiyat: "+order.getGame().getPrice());
		System.out.println("�ndirim Ad�: "+order.getCampaign().getCampaignName());
		System.out.println("�ndirim Oran�(%): "+order.getCampaign().getDiscount());
		System.out.println("�ndirimli Fiyat: "+ order.getCampaign().getPriceAfterDiscount());
		System.out.println("SATIN ALINDI.");
		
	}

}
