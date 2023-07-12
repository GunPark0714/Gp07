package day26.network.prac;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkpracServer {

	public static void main(String[] args) {
		
		int port = 5001; //1. 포트번호 설정
		ServerSocket serverSock = null;;
		
		try { 
			//2. 서버 소켓 생성
			serverSock = new ServerSocket(port);
			while(true) {   //3. 클라이언트가 연결을 요청할떄까지 대기
				System.out.println("Waiting");
				Socket socket = serverSock.accept(); //연결요청이 오면 수락
				System.out.println("[Connect!]");
				//5. 작업
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
