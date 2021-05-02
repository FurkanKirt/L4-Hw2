package classes;

import interfaces.Logger;

public class SQLLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("SQL'e Loglama "+message);
		
	}

}
