package day6.practice;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		/*1~100사이의 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요.
		 * 랜덤한 수를 생성(및 출력)
		 *반복문 : 맞출때까지 => 입력한 정수가 정답이 아니면 반복
		 *정수를 입력
		 *정수와 정답을 비교하여 판별
		 * input : 50
		 * Down!
		 * input : 40
		 * up!
		 * input : 45
		 * Good!
		 */
		
		    int min = 1, max = 100; 
			int num = min - 1; //1~100이 아닌 정수로 초기화 하면 됨. 최소값 -1을 해서 랜덤으로 나올 수 없는 수
		    char menu;
			       
			int random;
			Scanner sc = new Scanner(System.in);
		   
			/*외부 반복문 : 게임을 더 진행할건지 결정하는 반복문
			 * 반복횟수 : 입력받은 문자가 n이 아니면 반복
			 * 규칙성 : Up Down 게임 한 판 진행
			 */
		   
		    //정수와 정답을 비교하여 판별
		    //num가 random보다 크면 Down!, num가 random보다 작으면 up!, 아니면 Good!
	
		    	
		    do { random = (int)(Math.random() * (max - min + 1) + min);
		    do { System.out.println( "input : ");
		    num = sc.nextInt();
		        if(num > random) {System.out.println( "Down!");}
		        else if(num < random) {System.out.println( "Up!");}
		        else {System.out.println( "Good" );}
		        
		    
		    	
		    }while(random !=num);
		    
		    	//랜덤한 수 생성
		    	/* 내부 반복문 : up down 게임 진행하는 반복문
		    
		          * 반복횟수 : 입력받은 숫자가 랜덤한 숫자와 일치하지 않으면 반복
		          * 규칙성 : 입력받은 숫자가 정답보다 크면 Down!, 작으면 Up! 맞으면 Good!을 출력
		          * */
		    	//menu를 선택(더할건지 말건지)
		    	System.out.println( "continue? (y/n) : ");
		    	menu = sc.next().charAt(0);
		    }while(menu != 'n');
		          
		          
		    }}

		    
