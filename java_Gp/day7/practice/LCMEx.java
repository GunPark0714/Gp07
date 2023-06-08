package day7.practice;

import java.util.Scanner;
public class LCMEx {

	public static void main(String[] args) {
		/*
		 *최소 공배수 : 공배수 중 가장 작은 배수
		 *두 정수를 입력받아 두 정수를 최소공배수를 구하는 코드를 작성하세요.
		 */
		 /*방법1
		 *두 정수 입력
		 *반복횟수 : i는 1부터 num1*num2까지 1씩 증가
		 *규칙성 :i가 num1의 배수이고 1가 num2의 배수이면
		        i를 출력 후 반복문을 종료
		        => i를 num1로 나누었을 때 나머지가 0과 같고
		           i를 num2로 나누었을 때 나머지가 0과 같다면
		           i를 출력 후 반복문을 종료
		 *반복문 종료 후: 없음
		 */
		int num1, num2;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println( " input two numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		for (i = 1;  ; i++){
			
			
	        if ( i % num1 == 0 && i % num2 == 0)  {
	        	System.out.println( i );
	        	 break;
	        }
	        sc.close();
		}
	}
}
	        	 
	        	 
	        	 
		 
	    /*방법2
		 *두 정수 입력
		 *반복횟수 : i는 1부터 num1*num2까지 1씩 증가
		 *규칙성 :1가 num2의 배수이면 => i를 num2로 나누었을때 나머지가 0과 같다면 i를 출력 후 반복문을 종료
         i를 출력 후 반복문을 종료
         =>i를 num1로 나누었을 때 나머지가 0과 같고
          i를 num2로 나누었을 때 나머지가 0과 같다면
          i를 출력 후 반복문을 종료
		 *반복문 종료 후: 없음
		 */
    	/*int num1, num2;
 		int i;
 		Scanner sc = new Scanner(System.in);
 		System.out.println( " input two numbers : ");
 		num1 = sc.nextInt();
 		num2 = sc.nextInt();
 		for (i = 1;  ; i+=num1) {
 		    if( i % num2 == 0){
 		       System.out.println(i);
 		       break; 
	    
	    *
	    */ 		 
	   

