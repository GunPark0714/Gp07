package day3.practice;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	/*성적을 입력받아 입력받은 성적이 60점이상 이상인지 확인하는 코드를 작성하세요

예 : input score :
	
	65
	
    do you pass 65 points? true
    
    input score :
    
    45

    do you pass 45 points? false 
    */
		
	Scanner sc = new Scanner(System.in);
	System.out.println("input score : ");
	int score = sc.nextInt();
	Boolean result = score >= 60;
    System.out.println( "Do you pass" + score + " points? "+ result);
    
    sc.close();
    
    
    
    
	
	}
}