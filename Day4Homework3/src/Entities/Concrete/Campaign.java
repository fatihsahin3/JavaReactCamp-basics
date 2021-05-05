package Entities.Concrete;

import Entities.Abstract.Entity;

public class Campaign implements Entity{
	
	private int id;
	private String name;
	private int discountPercentage;
	
	public Campaign(int id, String name, int discountPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.discountPercentage = discountPercentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public int getId() {
		return id;
	}
	
	

}
