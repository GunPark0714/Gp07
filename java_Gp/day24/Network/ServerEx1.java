package day24.Network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {

	public static void main(String[] args) {
					int port = 5001;
					ServerSocket Serversocket = null;
					try {
						Serversocket = new ServerSocket(port);
						while(true) {
							System.out.println("Waiting");
							Socket socket = Serversocket.accept();
							System.out.println("connecting");
						}
					} catch (IOException e) {
						System.out.println("Exception");
						}
	
	
	
	
	}
}