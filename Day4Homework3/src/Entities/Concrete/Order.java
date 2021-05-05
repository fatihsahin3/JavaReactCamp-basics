package Entities.Concrete;

import Entities.Abstract.Entity;

public class Order implements Entity {
	
	private int id;
	private Customer customer;
	private Product product;
	
	public Order(int id, Customer customer, Product product) {
		this.id = id;
		this.customer = customer;
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getId() {
		return id;
	}

}
