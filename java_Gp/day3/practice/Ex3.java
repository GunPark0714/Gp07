package day3.practice;
import  java.util.Scanner;
public class  Ex3 {

	public static void main(String[] args) {
	
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("input number : ");
	num = sc.nextInt();
	
	if(num == 0){System.out.println(0);}
	if(num < 0){System.out.println(num + " is a negative number");}
	if(num > 0){System.out.println(num + " is a positive number");}
	
		
		
	sc.close();	
	}
	
  
	}
