package Business.Concrete;

import Business.Abstract.ProductService;
import Entities.Concrete.Product;

public class ProductManager implements ProductService {

	@Override
	public void add(Product product) {
		System.out.println(product.getName() + " was successfully added!");
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getName() + " was successfully updated!");
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getName() + " was successfully deleted!");
	}

	@Override
	public void get(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

}
