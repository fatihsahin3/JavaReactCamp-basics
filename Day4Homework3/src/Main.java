import Business.Concrete.CampaignManager;
import Business.Concrete.CustomerCheckManager;
import Business.Concrete.CustomerManager;
import Business.Concrete.OrderManager;
import Business.Concrete.ProductManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Customer;
import Entities.Concrete.Order;
import Entities.Concrete.Product;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Fatih", "Sahin", 1923, "18657895813");
		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager());
		customerManager.add(customer1);
		
		Product game1 = new Product(1, "Age of Empires", 100);
		Product game2 = new Product(2, "Grand Theft Auto", 100);
		ProductManager productManager = new ProductManager();
		productManager.add(game1);
		productManager.add(game2);
		
		Campaign campaign1 = new Campaign(1, "30% Discount", 30);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		Order order1 = new Order(1, customer1, game1);
		OrderManager orderManager = new OrderManager();
		orderManager.add(order1);
		
		Order order2 = new Order(2, customer1, game2);
		orderManager.setCampaign(campaign1);
		orderManager.add(order2);		

	}

}
