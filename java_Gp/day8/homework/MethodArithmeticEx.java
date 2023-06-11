package day8.homework;

import java.util.Scanner;
public class MethodArithmeticEx {

	public static void main(String[] args) {
		/*두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 * 단, 메서드 이용
		 * 연산자를 잘못 입력한 경우는 없다고 가정
		 * 0으로 나누는 일은 없다고 가정.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "input 2 nums and arithmetic operator : ");
		
		int num1, num2;
		char ch;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		ch = sc.next().charAt(0);
		int sum = num1 + num2;
		getArithmetic(ch);
		sc.close();
	}
	
  
    }
	    	
		
	

		
	
	  
	}	
		
	}
	

