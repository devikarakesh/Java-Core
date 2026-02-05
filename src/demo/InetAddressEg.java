package demo;

import java.net.InetAddress;

public class InetAddressEg {
	public static void main(String[] args) {
		try {
			//Get IP address of a website
			InetAddress address=InetAddress.getByName("google.com");
			System.out.println("IP Address of google:"+address.getHostAddress());
			
			//Get localhost details
			InetAddress localhost=InetAddress.getLocalHost();
			System.out.println("local host:"+localhost.getHostName());
			System.out.println("local ip address:"+localhost.getHostAddress());
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
