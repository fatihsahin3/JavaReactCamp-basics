package nLayeredDemo;

import java.util.Scanner;

import nLayeredDemo.business.abstracts.AuthService;
import nLayeredDemo.business.concretes.AuthManager;
import nLayeredDemo.business.concretes.UserManager;
import nLayeredDemo.core.concretes.GoogleManagerAdapter;
import nLayeredDemo.core.concretes.VerificationLink;
import nLayeredDemo.dataAccess.concretes.InMemoryUserDao;
import nLayeredDemo.entities.concretes.User;

public class Main {
	
	private static boolean flag = true;
	private static Scanner in = new Scanner(System.in);
	static AuthService authService = new AuthManager( new UserManager(new InMemoryUserDao()), new GoogleManagerAdapter(), new VerificationLink());

	public static void main(String[] args) {
		
		dashboard();
		
		//UserManager userManager = new UserManager(new InMemoryUserDao());
		//userManager.add(new User("fatih", "sahin", "fatihsahin@gmail.com", "123456"));
		//userManager.add(new User("engin", "demirog", "engindemirog@gmail.com", "123456"));
		//userManager.add(new User("kerem", "varis", "keremvaris@gmail.com", "123456"));
		//userManager.add(new User("murat", "kurtbogan", "muratkurtbogan@gmail.com", "123456"));
		
		//User randomUser = userManager.getById(4);
		//System.out.println(randomUser.getFullName());
		
	}
	
	public static void dashboard() {
		
		while (flag)
        {
            System.out.println("\n*************** Main Menu ***************");
            System.out.println("          1. User Register");
            System.out.println("          2. User Register With Google");
            System.out.println("          3. User Login");
            System.out.println("          3. User Logout");
            System.out.println("          4. Exit \n");
            
            int key = in.nextInt();
            switch (key)
            {
                case 1:
                    Register();
                    break;
                case 2:
                    RegisterGoogleAccount();
                    break;
                case 3:
                    Login();
                    break;
                case 4:
                    Logout();
                    break;
                case 5:
                	System.out.println("*************** Have a nice day. Good Bye :) ***************");
                    flag = false;
                    break;
                default:
                	System.out.println("\nYou entered an incorrect value! Please try again.");
                    break;
            }
        }
		
	}

	private static void Register() {
		
		System.out.println("First Name: ");
		String firstName = in.next();
		
		System.out.println("Last Name: ");
		String lastName = in.next();
		
		System.out.println("Email Address: ");
		String email = in.next();
		
		System.out.println("Password: ");
		String password = in.next();
		
		authService.register(firstName, lastName, email, password);
		
	}
	
	private static void RegisterGoogleAccount() {
		
		System.out.println("Email Address: ");
		String email = in.next().toString();
		
		System.out.println("Password: ");
		String password = in.next().toString();
		
		authService.registerByGoogle(email, password);
	}
	
	private static void Login() {
		
		System.out.println("Email Address: ");
		String email = in.next();
		
		System.out.println("Password: ");
		String password = in.next();
		
		authService.login(email, password);
	}
	
	private static void Logout() {
		
		authService.logout();
	}

}
