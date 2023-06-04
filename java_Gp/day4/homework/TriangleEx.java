package day4.homework;

import java.util.Scanner;
public class TriangleEx {

	public static void main(String[] args) {
		/* 세 변의 길이를 정수로 입력받아 세 변으로 삼각형을 만들 수 있는지 확인하는 코드를 만드세요.
		 * 세 변 중 작은 두 변의 길이의 합이 큰 변보다 커야 삼각형을 만들 수 있다.
		 */
		
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println( "Input num1, num2, num3" );
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if((num1 + num2) > num3) {System.out.println( "Possible");}
		else if((num1 + num3) > num2) {System.out.println( "Possible");}
		else if((num2 + num3) > num1) {System.out.println( "Possible");}
		else {System.out.println( "Impossible" );}
        
		sc.close();
		
		
		
		
		
	}

}
