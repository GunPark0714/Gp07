package day27.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOSIndiprac {

	public static void main(String[] args) {
		
			try(FileReader fr = new FileReader("file.txt")){
				char buffer [] = new char [1024];
				while(fr.read(buffer)!= -1) {
					System.out.print(buffer);
				}
			} catch (FileNotFoundException e) {
				System.out.println("file not found!");
			} catch (IOException e) {
				System.out.println("Exception!");
			}
		
			
			try(FileWriter fw = new FileWriter("file.txt")){
				String str = "Hello world\n";
				fw.write(str);
				String st2 = "Hi, Java!\n";
				fw.write(str);
			} catch (IOException e) {
				System.out.println("Exception!");
			}
	}
}
