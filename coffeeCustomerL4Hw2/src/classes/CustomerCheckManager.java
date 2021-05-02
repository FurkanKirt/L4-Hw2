package classes;

import entities.Customer;
import interfaces.CustomerChecked;

public class CustomerCheckManager implements CustomerChecked{

	@Override
	public boolean CheckPerson(Customer customer) {
		if(customer.getNationaltyId()=="12345678905") {
			return true;
		}else {
			return false;
		}
		
	}

}
