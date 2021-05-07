package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.AuthService;
import nLayeredDemo.business.abstracts.UserService;
import nLayeredDemo.core.abstracts.RegisterService;
import nLayeredDemo.core.abstracts.VerificationService;
import nLayeredDemo.entities.concretes.User;

public class AuthManager implements AuthService {
	
	private UserService userService;
	private RegisterService registerService;
	private VerificationService verificationService;
	
	public AuthManager(UserService userService, RegisterService registerService, VerificationService verificationService) {
		this.userService = userService;
		this.registerService = registerService;
		this.verificationService = verificationService;
	}
	
	@Override
	public void register(String firstName, String lastName, String email, String password) {
		if(this.userService.add(new User(firstName, lastName, email, password))) {
			System.out.println("Register successful! Please verify your e-mail address with the link sent.");
			this.verificationService.send();
		}else {
			System.out.println("Register Failed!");
		}
	}
	
	@Override
	public void registerByGoogle(String email, String password) {
		if(this.registerService.register(email, password) != null) {
			this.userService.add(this.registerService.register(email, password));
			System.out.println("You have successfully registered with your Google account.");
		}else {
			System.out.println("There is no user with this Google mail address!");
		}
	}
	
	@Override
	public void login(String email, String password) {
		if (this.userService.getByEmail(email) != null) {
			if(this.userService.getByEmail(email).getEmail().equals(email) && this.userService.getByEmail(email).getPassword().equals(password)) {
				System.out.println("Login successful");
			}else {
				System.out.println("Your e-mail address or password is incorrect!");
			}	
		} else {
			System.out.println("There is no registered user with this email address!");
		}
	}

	@Override
	public void logout() {
		System.out.println("You logged out successfully!");
	}

}
