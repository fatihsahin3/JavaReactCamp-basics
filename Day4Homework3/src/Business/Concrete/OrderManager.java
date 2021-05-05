package Business.Concrete;

import Business.Abstract.OrderService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Order;

public class OrderManager implements OrderService {
	
	Campaign campaign;

	@Override
	public void add(Order order) {
		
		int orderPrice = order.getProduct().getPrice();
		
		if (campaign != null) {
			
			int discount = this.campaign.getDiscountPercentage();				
			orderPrice = orderPrice - (orderPrice * discount / 100 );
			System.out.println("Campaign was applied!");
		}
		
		System.out.println("Order was successfully created! \n"
				+ "Order Id: " + order.getId() + "\n"
				+ "Customer: " + order.getCustomer().toString() + "\n"
				+ "Product: " + order.getProduct().getName()+ "\n"
				+ "Price: " + orderPrice);		
	}

	@Override
	public void update(Order order) {
		System.out.println("Order was successfully updated!");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Order was successfully deleted!");
		
	}

	@Override
	public void get(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;		
	}

	@Override
	public void removeCampaign() {
		this.campaign = null;
		
	}

}
