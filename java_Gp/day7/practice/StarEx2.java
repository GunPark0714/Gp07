package day7.practice;

public class StarEx2 {

	public static void main(String[] args) {
		/* *****    i = 1  *=5
 		 * *****    i = 2  *=5
		 * *****    i = 3  *=5
		 * *****    i = 4  *=5
		 * *****    i = 5  *=5
		 */
		/* 외부 반복문
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 실행문 : *i개를 출력후 엔터
		 **/
		//* 5개를 출력
		/* 내부 반복문
		 * 반복횟수 : j는 1부터 5까지 1씩 증가
		 * 규칙성 : *을 출력
		 */
		//엔터
		
		
		
				
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
	}
	}}

