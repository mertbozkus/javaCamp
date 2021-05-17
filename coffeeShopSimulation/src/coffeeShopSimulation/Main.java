package coffeeShopSimulation;

import coffeeShopSimulation.Abstract.BaseCustomerManager;
import coffeeShopSimulation.Adapters.MernisServiceAdapter;
import coffeeShopSimulation.Concrete.NeroCustomerManager;
import coffeeShopSimulation.Concrete.StarbucksCustomerManager;
import coffeeShopSimulation.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer();
	
		customer.setFirstName("Mert");
		customer.setLastName("Bozkus");
		customer.setDateOfBirth("2000");
		customer.setNationalityId("123456789");
		
		baseCustomerManager.Save(customer);
		
		System.out.println();
		
	}

}
