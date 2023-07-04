package day24.Network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx3 {

	public static void main(String[] args) {
		int port = 5001;//1. 포트번호 지정
		
		//2. ServerSocket 생성
		try(ServerSocket serverSocekt = new ServerSocket(port);){
			while(true) {
				//3. 연결 대기 후 요청이 오면 수락
				Socket socket = serverSocekt.accept();
				//연결한 클라이언트와 읽고 쓰기를 함
				//서버와 클라이언트의 기능이 다르면 SERVER클래스를 추가해서
				//아래부분을 client가 아닌 Server로 수정
				//4. 작업
				Client client = new Client(socket);
				//read()/send()순서 중요하지 않음. 어차피 스레드를 이용해서
				client.read();
				client.send();
			}
					
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
				sendThread.start();
				//4-2. 클라이언트에서 보낸 데이터를 읽어오는 스레드 생성 및 실행
				Thread readThread = new Thread(()->{
					try {
						InputStream is = socket.getInputStream();
						//데이터를 받는 작업을 무한히 반복. 클라이언트 연결이 끊길 때까지
						while(true) {
							//받아올 공간을 생성
							byte [] bytes = new byte[1024];
							//보내준 데이터를 공간에 받아옴
							is.read(bytes);
							//받아온 데이터를 문자열로 변환
							String str = new String(bytes);
							
							System.out.println("client : " + str);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
				readThread.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}