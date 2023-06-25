package day18.homework;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ImgEx {

	public static void main(String[] args) {
		/*파일명을 입력받아 파일이 이미지인지 확인하는 코드를 작성하세요.
		*이미지 확장자 : jpg, bmp, png(더 있지만 간단하게 3개만 체크)
		*input : dog.jpg
		*dog.jpg : Image
		*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input : ");
		String file = sc.next();
	
		String regex = "^a-zA-Z\\.(jpg|bmp|png)$";

		boolean result = Pattern.matches(regex, file);
			if (result = true) {
				System.out.println(file + " : " + "image");
			}
			else {System.out.println(file + " : " + "not image");
			}
		}
}
