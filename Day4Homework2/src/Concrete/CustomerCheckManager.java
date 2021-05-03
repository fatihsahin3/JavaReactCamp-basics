package Concrete;

import Abstract.ICustomerCheckService;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;		
	}

}
