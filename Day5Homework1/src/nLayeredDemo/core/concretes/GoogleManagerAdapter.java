package nLayeredDemo.core.concretes;

import nLayeredDemo.core.abstracts.RegisterService;
import nLayeredDemo.entities.concretes.User;
import nLayeredDemo.googleAuthManager.GoogleAuthManager;
import nLayeredDemo.googleAuthManager.GoogleUser;

public class GoogleManagerAdapter implements RegisterService {
	
	@Override
	public User register(String email, String password) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		GoogleUser googleUser = googleAuthManager.register(email, password);
		User user = this.convertGoogleUserToUser(googleUser);		
		return user;
	}
	
	private User convertGoogleUserToUser(GoogleUser googleUser) {
		User user = new User(googleUser.getFirstName(), googleUser.getLastName(), googleUser.getEmail(), googleUser.getPassword());
		return user;		
	}

}
