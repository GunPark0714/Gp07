package day19.homework;

import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		//산술연산하는 메서드를 만들고 테스트하는 코드를 작성하세요. 단 예외처리 이용
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		int num1 = 0; 
		int num2 = 0;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
	
		
		System.out.println(sum(num1,num2));
		System.out.println(sub(num1,num2));
		System.out.println(mul(num1,num2));
		System.out.println(div(num1,num2));
		try {
			System.out.println(mod(num1,num2));
		} catch (Exception e) {
	
			
		}
	
		
	}
	



	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	public static double div(int num1, int num2) {
		try {
		return num1 / num2;
		}catch(Exception e) {
			return 0;
		}
		
		
	}
	public static int mod(int num1, int num2) throws Exception{
			if {
				return num1 % num2;
			
		    throw new Exception("wrong operation");
			
			}
		}
	}
