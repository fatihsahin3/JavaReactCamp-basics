package nLayeredDemo.googleAuthManager;

import java.util.ArrayList;
import java.util.List;

public class GoogleAuthManager {
	
	static List<GoogleUser> googleUsers;
	
	public GoogleAuthManager() {
		googleUsers = new ArrayList<GoogleUser>();
		googleUsers.add(new GoogleUser("fatih", "sahin", "fatihsahin@gmail.com", "123456"));
		googleUsers.add(new GoogleUser("engin", "demirog", "engindemirog@gmail.com", "123456"));
		googleUsers.add(new GoogleUser("kerem", "varis", "keremvaris@gmail.com", "123456"));
		googleUsers.add(new GoogleUser("murat", "kurtbogan", "muratkurtbogan@gmail.com", "123456"));
	}
	
	public GoogleUser register(String email, String password) {
		GoogleUser googleUser = null;
		for (GoogleUser item : googleUsers) {
			if(item.getEmail().equals(email) && item.getPassword().equals(password)) {
				googleUser = item;
				break;
			}
		}
		return googleUser;
	}	

}
