package day4.practice;

import java.util.Scanner;

public class IfArithmeticx2 {

	public static void main(String[] args) {
		/*input 2 nums and operator :
		 * 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "input 2 nums and arithmetic operator(ex : 1 + 2) :");
		int num1, num2;
		char op;
	    num1 = sc.nextInt();
	    op = sc.next().charAt(0);
	    num2 = sc.nextInt();
	    int sum = (num1 + num2);
	    int sub = (num1 - num2);
	    int mul = (num1 * num2);
	    double div = (num1 / num2);
	    int mod = (num1 % num2);
	    
	    if(op == '+'){System.out.println( num1 + "+" + num2 + '=' + sum );}
	    else if(op == '-'){System.out.println( num1 + "-" + num2 + "=" + sub);}
	    else if(op == '*') {System.out.println( num1 + "*" + num2 + "=" + mul);}
	    else if(op == '/') {System.out.println( num1 + "/" + num2 + "=" + ((double)div));}
	    else if(op == '%') {System.out.println( num1 + "%" + num2 + "=" + mod);}
	    else {System.out.println( "op is not arithmetic operator!");}
		
		sc.close();
	}

}
