package day27.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharIOStreamEX {

	public static void main(String[] args) {
		//문자 단위로 읽어오는 예제
		try(FileReader fr = new FileReader("file.txt")){
			char buffer[] = new char[1024];
			while(fr.read(buffer) != -1) {
				System.out.print(buffer);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found!");
		} catch (IOException e) {
			System.out.println("Exception!");
		}
	
		//문자 단위로 쓰는 예제
									//FileWriter 생성자 (파일명, 이어쓰기 여부 -> true 이어쓰기, false(기본) 이어쓰기 안함. )
		try (FileWriter fw = new FileWriter("file.txt", true)){
			String str = "Hello world!\n";
			fw.write(str);
			String str2 = "hi, Java!\n";
			fw.write(str2);
		} catch (IOException e) {
			System.out.println("Exception!");
		}
	}
}