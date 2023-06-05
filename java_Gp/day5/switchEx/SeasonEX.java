package day5.switchEx;

import java.util.Scanner;
public class SeasonEX {

	public static void main(String[] args) {
		
		/* 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 7,8,9 : 가을
		 * 12,1,2 : 겨울
		 * 그 외 : 잘못된 월
		 */
		
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println( "input month : ");
		month = sc.nextInt();
		
		switch (month) {
		//month가 1,2,12일때 12의 실행문이 실행이 되서 겨울이 출력
		//1의 실행문이 없고, break문도 없음
		//2의 실행문이 없고, break문도 없음
		case 3 : case 4 : case 5: System.out.println( "Spring" ); //case 3,4,5:  //JDK 7버전 이후로 가능
		break;
		case 6 : case 7 : case 8: System.out.println( "Summer" );
		break;
		case 9 : case 10 : case 11: System.out.println( "fall" );
		break;
		case 12 : case 1 : case 2: System.out.println( "Winter" );
        break;
		default : System.out.println( " wrong input. ");
		}
		sc.close();
		
		}
		
	}


