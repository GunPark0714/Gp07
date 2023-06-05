package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		/* 국어 , 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		 * 
		 */

	    int Kor, Eng, Math;
	    double avg;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("국어, 영어, 수학 순으로 성적을 입력하세요. ex : 100 90 80 : ");
	    
	    //국어 , 영어, 수학순으로 성적을 입력
	    
	    //평균을 계산
	    
	    //평균을 출력
	    
	    Kor = sc.nextInt();
	    Eng = sc.nextInt();
	    Math = sc.nextInt();
	    avg = ( (Kor + Eng + Math) / 3.0); //(double)로 형변환도 가능. 3.0을 이용도 가능
	    
	    System.out.println( " 평균점수는" + avg + "점 입니다." );
	    sc.close();
	    
	}

}
