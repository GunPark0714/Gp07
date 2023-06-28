package day5.Homework;

import java.util.ArrayList;
import java.util.Scanner;
public class UpdownEx {

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
		ArrayList<Integer> list = new ArrayList<>();
		       
		int random = (int)(Math.random() * (max - min + 1) + min);
		Scanner sc = new Scanner(System.in);
		System.out.println( "input number");
	   
	    while ( num != random){System.out.println("input(1~100) : ");
	    num = sc.nextInt();
	    
	    //정수와 정답을 비교하여 판별
	    //num가 random보다 크면 Down!, num가 random보다 작으면 up!, 아니면 Good!
	  
	    	if ( num > random) {System.out.println( "Down!");}
	    	else if( num < random) {System.out.println( "Up!");}
	    	else {System.out.println( "Good!");
	    	}
	    }



	    
	    sc.close();
	}
		
}





