import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {
	public static  void main(String[]args) {
		BaseCustomerManager customer= new NeroCustomerManager(new MernisServiceAdapter());
		customer.Save(new Customer(26,"Ömer Faruk","Karaarslan", LocalDate.of(1999, 12, 30),"24421552498"));
		
	}
}
