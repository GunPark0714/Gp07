package day6.homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {
		/*
		 * 두 정수를 입력받아 두 정수가 서로소 관계인지 판별하는 코드를 작성하세요. 서로소 : 두 정수의 최대 공약수가 1인 두 수의 관계
		 * input 2 numbers : 3 4 disJoint!(서로소) input 2 numbers : 8 4 Not disjoint! (서로소
		 * 아님)
		 */

		int num1, num2;
		int i = 1;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		{System.out.println( " input 2 numbers : ");}
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		for (i = 1; i <= num1; i++) {
			if (  num1 % i == 0 &&  num2 % i == 0 )
			
			count++;	
	        }
		
			if(count >= 2 ) {System.out.println( "not disJoint!");
		    }
		    else {System.out.println("disjoint!");
			    
		    }

            sc.close();
	}
    }
        /*int i = 1;
		int num1, num2;
		int gcd = 1;
		Scanner sc = new Scanner(System.in);
		{System.out.println( " input 2 numbers : ");}
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		//반복문 (최대공약수를 구하기 위한) : i가 num1까지


		while ( i <= num1) {
     	if ( num1 % i == 0 && num2 % i == 0) {gcd = i;}
	
     	}

		System.out.println( num1 + " and " + num2 + " gcd : " + gcd);
        복문 종료 후 : gcd가 1이면 Disjoint를 출력하고, 아니면 Not disjoint를 출력 
              
         
		sc.close();
		*/
		