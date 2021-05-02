package classes;

import interfaces.Logger;

public class OracleLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Oracle'a Loglama "+message);
		
	}

}
