import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		 BaseCustomerManager customerManager = new  StarbucksCustomerManager(new MernisServiceAdapter());
		 customerManager.save(new Customer(1,"MERYEM","ÞEHÝTOÐLU",LocalDate.of(1997,5,1),"19687421008"));
		 System.out.println();
	}

}
