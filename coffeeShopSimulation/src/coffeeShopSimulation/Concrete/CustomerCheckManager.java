package coffeeShopSimulation.Concrete;

import coffeeShopSimulation.Abstract.ICustomerCheckService;
import coffeeShopSimulation.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		
	}

}
