package day5.Homework;

import java.util.Scanner;
public class TeamLeaderEx {

	public static void main(String[] args) {
		/* 30명의 학생이 있는 반에서 1번부터 연속된 번호를 가진 3명의 학생이 1조가 되도록 나누었다.
		 * 이 때 가장 큰 번호인 학생이 조장이 된다.
		 * 학생 번호가 주어졌을 때 조장인지 조원인지 판별하는 코드를 작성하세요.
		 * (Switch문으로)
		 * input student number : 1
		 * student number 1 is a member of the team.
		 * input student number : 6
		 * Student number 6 is the team leader.

		 */
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		num = sc.nextInt();
        		
		switch(num){ case 3,6,9,12,15,18,21,24,27,30 : System.out.println( num  +  " is a team leader!");
		       break;
		// switch(num % 3) case 0 : System.out.println( num  +  " is a team leader!");
		default : System.out.println( num  +  " is a member of the team!");
		}
		
			sc.close();
		
		}
		
		
		
	}


