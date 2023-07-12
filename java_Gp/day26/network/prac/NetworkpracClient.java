package day26.network.prac;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class NetworkpracClient {

	public static void main(String[] args) {
		int port = 5001; //서버 포트 번호
		//1.소켓 생성
		//2.연결 요청
		try (Socket socket = new Socket();) {
			//2.연결 요청
			socket.connect(new InetSocketAddress(5001));
			System.out.println("[Connected!]");
			//3. 작업
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
