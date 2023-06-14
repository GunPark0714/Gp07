package day11.homework;

import java.util.Arrays;
import java.util.Scanner;
public class BaseballGameEx {

	public static void main(String[] args) {
		/*숫자 야구 게임을 구현하세요.
		 * 1~9사이의 중복되지 않은 세 수를 맞추는 게임.
		 * 규칙 -> B : 같은 숫자가 있지만 위치가 다름
		 * S : 같은 숫자가 있고 위치가 다름
		 * 3O : 일치하는 숫자가 하나도 없음
		 */
		
		int min = 1, max = 9;
        int[]answer = new int[3];
                
      
		boolean checkanswer[] = new boolean[10];
		for(int i = 0; i<3;) {
        	int random = (int)(Math.random() * (max - min + 1) + min);
        	if(!checkanswer[random]) {
        		answer[i] = random;
        		i++;
        		checkanswer[random] = true;
        	}
		}
		for(int i = 0; i<3;i++)
			System.out.println(answer[i]);
					
		
		
		int[]guess=new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println(" input 3 numbers");
		for(int i = 0; i<3; i++) {
			guess[i] = sc.nextInt();
			
		}
		int str = 0;
		int ball = 0;
		int out = 0;
		
		
		while(str == 3) {
		}
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(answer[i] == guess[j]) {
				    if(i != j) {
				    	out++;
				    	System.out.println("out!");
				    }
				    else if(i == j) {
						str++;
						System.out.println(" strike :" + str + "," + "ball : " + ball );
					}	
					else ball++;
				    System.out.println(" strike :" + str + "," + "ball : " + ball );
					}
				}
			}
		
		if(str==3) {System.out.println(" Player win!");
		}
		
			else {System.out.println("input 3 numbers");		
			}
		}
	}
		
		
	
