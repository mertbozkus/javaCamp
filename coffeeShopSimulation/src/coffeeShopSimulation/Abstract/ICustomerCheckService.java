package coffeeShopSimulation.Abstract;

import coffeeShopSimulation.Entities.Customer;

	public interface ICustomerCheckService {
		
		public boolean CheckIfRealPerson(Customer customer);
}
