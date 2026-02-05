package demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
	public static void main(String[] args) {
		try {
			DatagramSocket Serversocket=new DatagramSocket(5000);
			byte[] receiveBuffer=new byte[1024];
			System.out.println("Udp is running");
			
			//receiving data
			DatagramPacket receivePacket=new DatagramPacket(receiveBuffer, receiveBuffer.length);
			Serversocket.receive(receivePacket);
			String clientmessage=new String(receivePacket.getData(),0,receivePacket.getLength());
			System.out.println("clientmessage:"+clientmessage);
			
			//sending data
			String response="hello from udp server";
			byte[] sendBuffer=response.getBytes();
			InetAddress clientAddress=receivePacket.getAddress();
			int clientPort=receivePacket.getPort();
			
			DatagramPacket sendPacket=new DatagramPacket(sendBuffer,sendBuffer.length,clientAddress,clientPort);
			Serversocket.send(sendPacket);
			Serversocket.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
