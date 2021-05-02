package classes;

import entities.Customer;
import interfaces.CustomerCRUD;
import interfaces.Logger;

public class NeroCustomerManager implements CustomerCRUD{

	private Logger[] loggers;
		
	
	public NeroCustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	@Override
	public void create(Customer customer) {
		System.out.println(customer.getFirstName() +"eklendi");
		Utils.runLogger(loggers, customer.getFirstName());
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
