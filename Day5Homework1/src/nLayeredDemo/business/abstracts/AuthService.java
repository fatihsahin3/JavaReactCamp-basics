package nLayeredDemo.business.abstracts;

public interface AuthService {
	
	void register(String firstName, String lastName, String email, String password);
	void registerByGoogle(String firstName,String password);
	void login(String email, String password);
	void logout();

}
