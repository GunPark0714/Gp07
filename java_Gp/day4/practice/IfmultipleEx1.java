package day4.practice;

import java.util.Scanner;
public class IfmultipleEx1 {

	public static void main(String[] args) {
		// 2의 배수 확인 예제 (홀짝 판별)
		
		
		
		
		
		int num;
		System.out.println("input number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num % 2 == 0){System.out.println( num + "는 2의 배수입니다.");}
		else{System.out.println( num + "는 2의 배수가 아닙니다. ");}
		
		sc.close();
	}
 	}


