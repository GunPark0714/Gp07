package day19.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		//두 정수와 산술연산자를 입력했을 때 연산 결과를 출력하는 코드를 작성하세요. 예외처리도 추가
			
			//두 정수와 산술연산자 입력
			Scanner sc = new Scanner(System.in);
			System.out.println( "input 2 nums and arithmetic operator(ex : 1 + 2) :");
			try {
			int num1, num2;
			char op;
		    num1 = sc.nextInt();
		    op = sc.next().charAt(0);
		    num2 = sc.nextInt();
		    int sum = (num1 + num2);
		    int sub = (num1 - num2);
		    int mul = (num1 * num2);
		    double div = (num1 / num2);
		    int mod = (num1 % num2);
		    
		    //연산자에 따른 결과를 출력
		    if(op == '+'){System.out.println( num1 + "+" + num2 + '=' + sum );}
		    else if(op == '-'){System.out.println( num1 + "-" + num2 + "=" + sub);}
		    else if(op == '*') {System.out.println( num1 + "*" + num2 + "=" + mul);}
		    else if(op == '/') {System.out.println( num1 + "/" + num2 + "=" + ((double)div));}
		    else if(op == '%') {System.out.println( num1 + "%" + num2 + "=" + mod);}
		    else {System.out.println( "op is not arithmetic operator!");}
			
			
			sc.close();
			
			
			
			}catch(InputMismatchException e) {
				System.out.println("Wrong Input!");
			}catch(ArithmeticException e) {
				System.out.println("Not operation!");
			}
			catch(Exception e) {
				//예외처리
				System.out.println("Exception");
		}
			System.out.println("EXIT!");
			test1();
			test2();
		
	}
		public static void test1() {
			try {
				System.out.println(1/0);
			}catch(Exception e) {
				System.out.println("Exception!!!!!");
				return;
			}
			finally {
				System.out.println("Method1 EXIT!!!");
			}
		}
		public static void test2() {
			try {
				System.out.println(1/0);
			}catch(Exception e) {
				System.out.println("Exception!!!!");
				return;
		}
			System.out.println("Method2 EXIT!!!!");
	}
}

