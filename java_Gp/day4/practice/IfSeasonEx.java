package day4.practice;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {
		/* 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 7,8,9 : 가을
		 * 12,1,2 : 겨울
		 * 그 외 : 잘못된 월
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.println( " 월을 입력하세요 : ");
		month = sc.nextInt();
		
		if(month == 3 || month == 4 || month == 5) {System.out.println( "spring" );}
		else if(month == 6 || month == 7 || month == 8) {System.out.println( "summer");}
		else if(month == 9 || month == 10 || month == 11) {System.out.println( "fall");}
		else if(month == 12 || month == 1 || month == 2){System.out.println( "winter" );}
		else {System.out.println( "잘못된 월" );}
		
		
		sc.close();

	}
		
	}	


