package day5.Homework;

import java.util.Scanner;
public class UpdownEx {

	public static void main(String[] args) {
		/*1~100사이의 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요.
		 * 랜덤한 수 : 45
		 * input : 50
		 * Down!
		 * input : 40
		 * up!
		 * input : 45
		 * Good!
		 */
	
		int i, num;
		Scanner sc = new Scanner(System.in);
	    System.out.println( "input number" );
	    i = sc.nextInt();
	    
	    while ( i == num) {System.out.println( "input number" );}
	    	
	    
	        if ( i < num){System.out.println( "Down!");}
	    	else if ( i > num) {System.out.println( "Up!");}
	    	else if ( i == num) {System.out.println( "Good!");}
	        
	    	
	    	}
	    	
	    
	}

}
