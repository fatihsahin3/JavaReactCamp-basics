package Business.Concrete;

import Business.Abstract.CustomerCheckService;
import Entities.Concrete.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	//Fake identity check manager
	@Override
	public boolean validateCustomer(Customer customer) {
		if (customer.getFirstName().isEmpty() 
				|| customer.getLastName().isEmpty() 
				|| String.valueOf(customer.getBirthYear()).isEmpty()
				|| customer.getIdentityNumber().isEmpty()) 
		{
			return false;			
		} else {
			return true;
		}
	}

}
