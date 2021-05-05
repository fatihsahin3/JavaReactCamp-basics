package Business.Abstract;

import Entities.Concrete.Customer;

public interface CustomerCheckService {
	
	boolean validateCustomer(Customer customer);

}
