package day6.practice;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
		// 국어 ,영어 , 수학 성적을 입력받아 평균을 구하는 코드를 작성하세요
		// n 을 입력하기 전까지
		//반복문 : menu가 n이 아니면 반복(y,n이 아닌 다른 문자를 입력하면 반복.) 
		//menu가 y면 반복(y,n이 아닌 다른 문자를 입력하면 종료)
		
		int Kor, Eng, Math;
	    char menu = 'y';
	    double avg;
	    
		
		Scanner sc = new Scanner(System.in);
		
		while (menu != 'n') {  System.out.println( " input Kor, Eng, Math score : ");
	    Kor = sc.nextInt();
		Eng = sc.nextInt();
		Math = sc.nextInt();
		avg = (Kor + Eng + Math) / 3.0;
		System.out.println( "average : " + avg);
		System.out.println( "continue? (y/n)  : ");
		menu = sc.next().charAt(0);
		}
	    System.out.println( " EXIT!" );
	    sc.close();
	    
	    }    
	} 

 
	    
		



	
