package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DomainCombiner;

public class Server {
	public static void main(String[] args) {
		try(ServerSocket serverSocket=new ServerSocket(6000)) {
		System.out.println("server is running...waiting for client");
			
		try(Socket socket=serverSocket.accept()){
			System.out.println("client connected");
			
			BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter output=new PrintWriter(socket.getOutputStream(),true);
			
			
			String clientMessage;
			
			//keep reading until the client closes the connection 
			while((clientMessage=input.readLine())!=null){
				System.out.println("client:"+clientMessage);
				
				output.println("echo:"+clientMessage);
				
				if(clientMessage.equalsIgnoreCase("exit")) {
					System.out.println("client requested to exit");
					break;
				}
			}
		}
			
		}catch (Exception e) {
			e.getMessage();
		}
		
	}

}
