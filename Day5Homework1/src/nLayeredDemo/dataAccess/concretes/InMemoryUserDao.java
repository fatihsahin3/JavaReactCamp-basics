package nLayeredDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo.dataAccess.abstracts.UserDao;
import nLayeredDemo.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	
	private List<User> userList;
	private int userId;
	
	public InMemoryUserDao() {
		userList = new ArrayList<User>();
		userId = 0;
	}
	
	@Override
	public void add(User user) {
		user.setId(userId + 1);
		userList.add(user);
		userId++;
	 // System.out.println(user.getFullName() + " has been added.");
	}
	
	@Override
	public void update(User user) {
		int index = user.getId()-1;
		System.out.println(index);
		userList.set(index, new User(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword()));
		System.out.println(user.getFullName() + " has been updated.");
	}
	
	@Override
	public void delete(User user) {
		userList.remove(user.getId()-1);
		userId--;
		System.out.println(user.getFullName() + " has been deleted.");
	}
	
	@Override
	public User getById(int id) {
		User user = null;
		for (User item : userList) {
			if(item.getId() == id)
			{
				user = item;
			}
		}
		return user;
	}
	
	@Override
	public List<User> getall() {
		return userList;
	}
	
	@Override
	public User getByEmail(String email) {
		User user = null;
		for (User item : userList) {
			if(item.getEmail().equals(email))
			{
				user = item;
			}
		}
		return user;
	}
}
