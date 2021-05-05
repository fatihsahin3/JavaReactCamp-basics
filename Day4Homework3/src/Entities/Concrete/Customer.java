package Entities.Concrete;

import Entities.Abstract.Entity;

public class Customer implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private String identityNumber;
	
	public Customer(int id, String firstName, String lastName, int birthYear, String identityNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.identityNumber = identityNumber;
	}
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	
	@Override
    public String toString() {
        return String.format(this.firstName + " " + this.lastName);
    }

}
