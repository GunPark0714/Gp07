package day25.practice.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("Student_list");
			int data;
			do {
					data = fis.read();
					if (data == -1) {
						break;
			} 
			System.out.println(data);
			}while(true);
			System.out.println();
			System.out.println("File reader Success!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
