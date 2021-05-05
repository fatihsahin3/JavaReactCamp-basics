package Business.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Order;

public interface OrderService {
	
	void add(Order order);
	void update(Order order);
	void delete(Order order);
	void get(int id);
	void getAll();
	void setCampaign(Campaign campaign);
	void removeCampaign();
}
