package day24.Network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx1 {

	public static void main(String[] args) {
		
		int port = 5001; //서버 포트 번호
		Scanner sc = new Scanner(System.in);
		//1. 소켓 생성
		
		//2. 연결요청
		try (Socket socket = new Socket();){
			socket.connect(new InetSocketAddress(5001));
			System.out.println("[Connect!]");
			//3. 작업
			//서버에 데이터 전송을 위해 OutputStream 생성
			OutputStream os = socket.getOutputStream();
			String str = sc.nextLine(); //보내려는 데이터
			byte [] bytes = str.getBytes(); //Hi를 바이트로 변환
			os.write(bytes);
			os.flush();
			InputStream is = socket.getInputStream();
			bytes = new byte[1024];
			int readCount = is.read(bytes);
		    str = new String(bytes);
		    System.out.println("server : " + str);
 			
		    is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
