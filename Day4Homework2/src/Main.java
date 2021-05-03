import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.Customer;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		
		LocalDate birthDay = LocalDate.of( 1986 , Month.FEBRUARY , 20 );
	    
		customer.setDateOfBirth(birthDay);
		customer.setFirstName("FATİH");
		customer.setLastName("ŞAHİN");
		customer.setNationalityId("16112810864");
	
		customerManager.Save(customer);

	}

}
