package day8.homework;

import java.util.Scanner;

public class MethodMonthEx {

	public static void main(String[] args) {
		/*월을 입력받아 월에 맞는 영어를 출력하세요.
		 * 단 메서드 이용
		 */
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("input num : ");
	    num = sc.nextInt();
		String month = getSeason(num);
		
		
		System.out.println( num + " is " +  getSeason(num));
		
		sc.close();
		}
		
		public static String getSeason(int num) {
		    if(num == 1) {return "January" ;}
		    else if(num == 2) {return "Fabuary" ;}
		    else if(num == 3) {return "March" ;}
		    else if(num == 4) {return "April" ;}
		    else if(num == 5) {return "May" ;}
		    else if(num == 6) {return "June" ;}
		    else if(num == 7) {return "July" ;}
		    else if(num == 8) {return "August" ;}
		    else if(num == 9) {return "September" ;}
		    else if(num == 10) {return "October" ;}
		    else if(num == 11) {return "Novermber" ;}
		    else if(num == 12) {return "December" ;}
		    else {return "Wrong month.";}
		    
		 }
			
	}


			
	
			
