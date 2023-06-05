package day4.homework;

import java.util.Scanner;
public class MaxEx {

	public static void main(String[] args) {
		/* 두 정수를 입력받아 큰 수를 출력하는 코드를 작성
		 * 
		 */
	 int num1, num2;
	 //두 수 중 큰 수를 저장할 변수 int max;
	 
	 //두 정수를 입력
	 
	 //큰 수를 max에 저장
	 //num1이 num2보다 크거나 같으면 max에 num1을 저장
     
	 //아니면 max에 num2를 저장
	 
	 //max를 출력
	 Scanner sc = new Scanner(System.in);
	 System.out.println(" Input num1, num2 ");
	 num1 = sc.nextInt();
	 num2 = sc.nextInt();
	 
	 //큰 수를 max에 저장
	 //num1이 num2보다 크거나 같으면 max에 num1을 저장
	 if (num1 > num2){System.out.println( num1 );}
	 else if (num1 == num2) {System.out.println("Imposibble to compare");}
	 //아니면 max에 num2를 저장
	 //max = num2;
	 else {System.out.println( num2 );}
	 //max = 100;
	 //max = num1 >= num2 ? num1 : num2;
	 sc.close();
	}}
	

