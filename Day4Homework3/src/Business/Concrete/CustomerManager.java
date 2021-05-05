package Business.Concrete;

import Business.Abstract.CustomerCheckService;
import Business.Abstract.CustomerService;
import Entities.Concrete.Customer;

public class CustomerManager implements CustomerService {
	
	CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		
		if (validateCustomer(customer)) {
			System.out.println("Customer " + customer.toString() + " was successfully added!");
		} else {
			System.out.println("Customer is not a real person!");
		}
	}

	@Override
	public void update(Customer customer) {
		
		if (validateCustomer(customer)) {
			System.out.println("Customer " + customer.toString() + " was successfully updated!");
		} else {
			System.out.println("Customer is not a real person!");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		
		System.out.println("Customer " + customer.toString() + " was successfully deleted!");		
	}

	@Override
	public void get(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}
	
	private boolean validateCustomer(Customer customer) {
		
		if (customerCheckService.validateCustomer(customer)) {
			return true;			
		} else {
			return false;
		}		
	}

}
