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
		
			    if(count < 2 ) {System.out.println( "disJoint!");
			    }
			    else {System.out.println("not disjoint!");
			    }

               sc.close();
	}
}
