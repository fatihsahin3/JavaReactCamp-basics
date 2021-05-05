package Business.Abstract;

import Entities.Concrete.Customer;

public interface CustomerService {
	
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	void get(int id);
	void getAll();	

}
