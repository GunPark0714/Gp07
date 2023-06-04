package day4.homework;

import java.util.Scanner;
public class MaxEx {

	public static void main(String[] args) {
		/* 두 정수를 입력받아 큰 수를 출력하는 코드를 작성
		 * 
		 */
	 int num1, num2; 
	 Scanner sc = new Scanner(System.in);
	 System.out.println(" Input num1, num2 ");
	 num1 = sc.nextInt();
	 num2 = sc.nextInt();
	 
	 if (num1 > num2){System.out.println( num1 );}
	 else if (num1 == num2) {System.out.println("Imposibble to compare");}
	 else {System.out.println( num2 );}
	
	
	 sc.close();
	}}
	

