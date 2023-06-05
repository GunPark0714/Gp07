package day4.homework;

import java.util.Scanner;

public class NumberEx {

	public static void main(String[] args) {
		/* 정수 num가 짝수이면 num에 2를 나누고, 정수 nul이 홀수이면 num에 1을 더한 후
		 * num을 출력하는 코드를 작성하세요.
		 */
		
		
	//정수 입력
		
     int num;
	 Scanner sc = new Scanner(System.in);
	 System.out.println( "Input number : ");
	 num = sc.nextInt();
	 
	 if(num % 2 == 0){System.out.println( num / 2);} //num /= 2;
	 else {System.out.println( num + 1 );} //num = num + 1; num += 1;
	 
	 sc.close();
	 
	}

}
