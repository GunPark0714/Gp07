package day5.Practice;

import java.util.Scanner;
public class DivisorEx {

	public static void main(String[] args) {
		/*정수 num를 입력받아 num의 약수를 출력하는 코드를 작성하세요.
		 * 약수 : A를 B로 나누었을 때 나머지가 0이면 B는 A의 약수이다.
		 * 12의 약수 : 1 2 3 4 6 12
		 */

		int i = 1; 
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input positive number : ");
		num = sc.nextInt();
		
		/* 반복횟수 : i는 1부터 num까지 1씩 증가
		 * 규칙성 : i가 num의 약수이면 i를 출력 => (num % i == 0){System.out.printIn(i)} 
	    */
		while ( i <= num) {
			if (num % i == 0){System.out.println(i);}
		
		++i;
		}
		
		sc.close();
	    
		
	}

}
