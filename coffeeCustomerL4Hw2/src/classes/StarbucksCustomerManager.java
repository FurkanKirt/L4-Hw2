package classes;

import entities.Customer;
import interfaces.CustomerCRUD;
import interfaces.Logger;

public class StarbucksCustomerManager extends CustomerCheckManager implements CustomerCRUD{

	private Logger[] loggers;
	
	
	public StarbucksCustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	@Override
	public void create(Customer customer) {
		if(CheckPerson(customer)==true) {
			Utils.runLogger(loggers, customer.getFirstName());
		}else {
			System.out.println("hatalý tc");
		}
		
	}

	@Override
	public void read(Customer customer) {
		System.out.println(customer.getFirstName() +"okundu");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+"güncellendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+"silindi");
		
	}

}
