package demo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServer {
	public static void main(String[] args) {
		try {
			CalculatorImpl calc=new CalculatorImpl();
			Registry registry=LocateRegistry.createRegistry(1099);//default rmi port
			registry.rebind("calculatorService",calc);
			
			System.out.println("RMI server is running");
		}catch (Exception e) {
			System.out.println("server error:"+e.getMessage());
		}
		
	}

}
