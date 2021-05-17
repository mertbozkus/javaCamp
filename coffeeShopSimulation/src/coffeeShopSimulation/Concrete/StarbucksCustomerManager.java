package coffeeShopSimulation.Concrete;

import coffeeShopSimulation.Abstract.BaseCustomerManager;
import coffeeShopSimulation.Abstract.ICustomerCheckService;
import coffeeShopSimulation.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			System.out.println("Not a valid person");
		}
		
	}


	
}
