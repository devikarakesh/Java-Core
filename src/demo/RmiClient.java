package demo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
	public static void main(String[] args) {
		try {
			Registry registry=LocateRegistry.getRegistry("localhost",1099);
			Calculator calc=(Calculator)registry.lookup("calculatorService");
			
			System.out.println("Addition:"+calc.add(5, 3));
			System.out.println("subtraction:"+calc.sub(10, 4));
		}catch (Exception e) {
			System.out.println("client server:"+e.getMessage());
		}
	}

}
