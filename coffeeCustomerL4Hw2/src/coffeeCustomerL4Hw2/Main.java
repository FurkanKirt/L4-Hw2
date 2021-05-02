package coffeeCustomerL4Hw2;

import java.sql.Date;


import classes.NeroCustomerManager;
import classes.OracleLogger;
import classes.SQLLogger;
import classes.StarbucksCustomerManager;
import entities.Customer;
import interfaces.Logger;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new SQLLogger(),new OracleLogger()};
		Customer customer =new Customer(1,"Furkan","K",new Date(1995,1,26),"12345678905");
		Customer customer2=new Customer(2,"Gökhan","K",new Date(1999,9,25),"12345641354");
		//customer 2 hatalý olan
		NeroCustomerManager  neroManager=new NeroCustomerManager(loggers);
		neroManager.create(customer);
		neroManager.create(customer2);
		
		
		
		StarbucksCustomerManager starbucks=new StarbucksCustomerManager(loggers);
		starbucks.create(customer);
		starbucks.create(customer2);
		
		

	}

}
