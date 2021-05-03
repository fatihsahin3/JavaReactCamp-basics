package Abstract;

import java.rmi.RemoteException;

import Concrete.Customer;

public interface ICustomerCheckService {
	
	public boolean checkIfRealPerson(Customer customer);

}
