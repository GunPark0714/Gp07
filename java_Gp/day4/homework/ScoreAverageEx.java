package day4.homework;

import java.util.Scanner;
public class ScoreAverageEx {

	public static void main(String[] args) {
		/* 국어 , 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		 * 
		 */

	    int num1, num2, num3;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("국어, 영어, 수학 성적을 입력하세요");
	    num1 = sc.nextInt();
	    num2 = sc.nextInt();
	    num3 = sc.nextInt();
	    int avg = ( (num1 + num2 + num3) / 3);
	    
	    System.out.println( " 평균점수는" + avg + "점 입니다." );
	    sc.close();
	    
	}

}
