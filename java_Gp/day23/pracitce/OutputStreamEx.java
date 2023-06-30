package day23.pracitce;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		//정수를 1부터 10까지 파일에 저장하는 코드를 작성하세요.
		//output1.txt
		
		
		//파일을 생성
		 	try(FileWriter fw = new FileWriter("output1.txt")){
		 		//파일에 숫자를 씀
		 		for(int i=1;i<=10;i++) {
		 			fw.write(i);
		 		}
		 		System.out.println("File writer Success");
		 		System.out.println("===============");
		 	} catch (IOException e) {
				e.printStackTrace();
			
			}
		 		
		
		//파일에 쓴 숫자를 읽어옴
		 	
		 	try(
		 		FileOutputStream fos = new FileOutputStream("output2.txt");	
	 			ObjectOutputStream oos = new ObjectOutputStream(fos)){
		 		oos.writeChars("Hello\n");
		 		for(int i = 1; i<=10; i++) {
		 			oos.writeInt(i);
		 		}
			} catch (IOException e) {
				e.printStackTrace();
		}
	}
}
