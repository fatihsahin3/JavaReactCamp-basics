package nLayeredDemo.entities.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredDemo.entities.abstracts.Entity;

public class User implements Entity{
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public User(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;		
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (this.validateEmail(email)) {
			this.email = email;			
		} else {
			System.out.println("Email format is not valid!");
		}		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	private boolean validateEmail(String email) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}
