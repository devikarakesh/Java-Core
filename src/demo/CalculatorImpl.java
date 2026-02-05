package demo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator{
	protected CalculatorImpl() throws RemoteException{
		super(); //exporting the remote object
	}

	@Override
	public int add(int a, int b) throws RemoteException {
		return a+b;
	}

	@Override
	public int sub(int a, int b) throws RemoteException {
		return a-b;
	}

}
