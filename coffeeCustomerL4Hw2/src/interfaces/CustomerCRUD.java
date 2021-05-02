package interfaces;

import entities.Customer;

public interface CustomerCRUD {
	void create(Customer customer);
	void read(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
