package demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

public class UDPclient {
	public static void main(String[] args) {
		try {
			DatagramSocket clientSocket=new DatagramSocket();
			InetAddress serverAddress=InetAddress.getByName("localhost");
			
			//sending data
			String message="hello from udp client";
			byte[] sendBuffer=message.getBytes();
			DatagramPacket sendPacket=new DatagramPacket(sendBuffer, sendBuffer.length,serverAddress,5000);
			clientSocket.send(sendPacket);
			
			//receive data
			byte[] receiveBuffer=message.getBytes();
			DatagramPacket receivePacket=new DatagramPacket(receiveBuffer, receiveBuffer.length);
			clientSocket.receive(receivePacket);
			String serverMessage=new String(receivePacket.getData(),0,receivePacket.getLength());
			System.out.println("servermessage:"+serverMessage);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
