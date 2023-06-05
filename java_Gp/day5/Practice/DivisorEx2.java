package day5.Practice;

import java.util.Scanner;
public class DivisorEx2 {

	public static void main(String[] args) {
		/* 정수 num을 입력받아 num가 소수인지 아닌지를 판별하는 코드를 작성하세요.
		 * 약수가 1과 자기 자신밖에 없는 수
		 */
		
		
		int i = 1;
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println( "input positive number");
        num = sc.nextInt();
        
        i = 1;
        while ( i <= num) {
        	if ( num % i == 0 )
        i++;
        	
            if(i == 2) {System.out.println(num + "is a prime number.");
            }
            else {System.out.println("is not a prime number.");}
            
        sc.close();
        
        }
		
	}}


