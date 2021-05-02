package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] logger = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		
		CustomerManager customerManager = new CustomerManager(logger);
		
		Customer engin = new Customer(1, "Engin", "Demirog");
		
		customerManager.add(engin);

	}

}
