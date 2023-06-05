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
		 
 	    int min = 1; 
	    int max = 100;
		       
		int random = (int)(Math.random() * (max - min + 1) + min);
		Scanner sc = new Scanner(System.in);
	    System.out.println( random );
	    
	    System.out.println( "input number");
	    int i;
	    i = sc.nextInt();
	    
		while ( i != random) {  
 	    	System.out.println( "input number" );
	    
	  
	    	if ( i < random) {System.out.println( "Down!");}
	    	else if ( i > random) {System.out.println( "Up!");}
	    	else if ( i == random) {System.out.println( "Good!");}
	 	    	
	    
	        
	        
	        sc.close();    
	}
	}
}


