
package day3.homework;

import java.util.Scanner;
public class Ex1_conditional {

	public static void main(String[] args) {
		/* input gender :
		 * M
		 * Are you a women? false
		 * 
		 * input gender :
		 * W
		 * Are you a women? true
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println( "input gender :" );
		char gender;
		gender = sc.next().charAt(0);
		boolean result = gender == 'W' ? true : false;
		System.out.println(" Are you a women?" + result);
//<<<<<<< Updated upstream
	
	
	    sc.close();

		
		sc.close();
	}}
