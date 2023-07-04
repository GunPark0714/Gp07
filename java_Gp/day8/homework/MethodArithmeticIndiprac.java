package day8.homework;

import java.util.Scanner;

import day18.practice.StringCharAtEX;

public class MethodArithmeticIndiprac {

	public static void main(String[] args) {
		/*두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 * 단, 메서드 이용
		 * 연산자를 잘못 입력한 경우는 없다고 가정
		 * 0으로 나누는 일은 없다고 가정.
		 */
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char operator;
		double res;
		System.out.println("input (ex= 1 + 2) : ");
		num1 = sc.nextInt();
	    operator = sc.next().charAt(0);
	    num2 = sc.nextInt();
	    
	    res = Arithmetic(num1,operator,num2);
	    System.out.println(num1 + " "+ operator + " " + num2 + " = " + res);
	    sc.close();
	}
	public static double Arithmetic(int num1, char operator, int num2) {
		double res = 0.0;
		switch(operator) {
		case '+' :
			res = num1 + num2;
			break;
		case '-' :
			res = num1 - num2;
			break;
		case '*' :
			res = num1 * num2;
			break;
		case '/':
			res = num1 /(double) num2;
			break;
		case '%':
			res = num1 % num2;
			break;
		default :
			System.out.println("Wrong input!");
		}
			return res;
	}
}