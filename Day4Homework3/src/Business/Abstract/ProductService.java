package Business.Abstract;

import Entities.Concrete.Product;

public interface ProductService {
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	void get(int id);
	void getAll();	

}
