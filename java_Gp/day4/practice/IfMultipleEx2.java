package day4.practice;

import java.util.Scanner;
public class IfMultipleEx2 {

	public static void main(String[] args) {
		
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number : ");
		num = sc.nextInt();
		
		//6의 배수일 때 원하는 동작이 실행되기 위해 6의 배수먼저 체크하도록 순서를 신경씀.
		if(num % 6 == 0) {System.out.println("A multiple of 6");}
		else if(num % 3 == 0) {System.out.println("A multiple of 3");}
		else if(num % 6 == 0){System.out.println("A multiple of 6");}
		else {System.out.println( num + "is etc Number.");}
		
		
		//6의 배수가 아닌 2의 배수만 찾기 위해 2의 배수이지만 3의 배수가 아닌 정수를 확인
		if(num % 2 == 0 && num % 3 !=0 && num % 6 !=0){System.out.println(num + "is multifple of 2.");}
		else if(num % 3 == 0 && num % 2 !=0){System.out.println( num + "is multiple of 3.");}
		else if(num % 6 == 0){System.out.println( num + "is multiple of 6.");}
		else {System.out.println(num + " is etc Number.");}
		
		sc.close();		
		
}

}
