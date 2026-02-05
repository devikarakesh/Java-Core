package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {
			//connect to server
			Socket socket=new Socket("localhost",6000);
			System.out.println("connected to server!");
			
			//setup input and outputstreams
			BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter output=new PrintWriter(socket.getOutputStream(),true);
			
			Scanner sc=new Scanner(System.in);
			
			String userInput;
			do {
				System.out.println("type msg (or 'exit'):");
				userInput=sc.nextLine();
				
				//send msg to server
				output.println(userInput);
				
				//receive server response
				String serverMessage=input.readLine();
				System.out.println("server:"+serverMessage);
			}while(!userInput.equalsIgnoreCase("exit"));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
