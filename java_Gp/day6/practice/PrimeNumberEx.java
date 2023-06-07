package day6.practice;

import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {
		//2부터 100사이의 소수를 출력하는 코드를 작성하세요.
		
		
		int n, i, count = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
	
		for(i = 2; i <= 100 ; i++ ) {
			//i가 num의 약수이면 약수의 개수 count를 1증가
			if ( n % i == 0) {
				count++;
			}
			i++;
		if (count == 2) {System.out.println( i );
		
		}
		sc.close();
			
		
		
		
		
		
		
		
	}
	}}
