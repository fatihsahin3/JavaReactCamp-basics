package inheritance2;

public class Main {

	public static void main(String[] args) {
		
		customerManager customerManager = new customerManager();
		customerManager.add(new DatabaseLogger());

	}

}
