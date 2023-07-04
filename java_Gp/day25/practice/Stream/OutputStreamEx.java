package day25.practice.Stream;

import java.io.FileWriter;
import java.io.IOException;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		try (FileWriter fw = new FileWriter("Student_list")){
				for(int i=1;i<=10;i++) {
					fw.write(i);
				}
				System.out.println("File Write Success!");
				System.out.println("===================");
			} catch (IOException e) {
			e.printStackTrace();
		}
	}
}