package day24.Network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Serverclient {

	public static void main(String[] args) {
			
		int port = 5001;
		ServerSocket serversocket = null;
		
		try {
			serversocket = new ServerSocket(port);
			while(true) {
				System.out.println("Waiting");
			    Socket socket = serversocket.accept();
			    System.out.println("connected");
			}
		} catch (IOException e) {
			System.out.println("exception!");
		}
		
		
		
		int port = 5001;
		Scanner sc = new Scanner(System.in);
		socket.connect(new InetSocketaddress(port));
		System.out.println("connected!");
		
	}

}
