package day16.homework.vo;

import lombok.Data;
import lombok.AllArgsConstructor; //모든 멤버를 매개변수로 하는 생성자 추가

		/* 음료수를 뽑는 자판기 프로그램을 작성하세요
		 * 단 음료수 자판기에 음료수는 사이다, 콜라, 환타가 고정이라고 가정
		 * 메뉴를 선택하면 음료수와 잔액이 나옴(출력).
		 * 1. 금액 투입
		 * 2. 메뉴 선택
		 * 3. 제품 입고
		 * 4. 프로그램 종료
		 * 
		 * 메뉴선택2 1.사이다 2.콜라 3.환타 
		 * 음료선택 1 -> 사이다를 선택했습니다. -> 사이다가 나옵니다[금액이 충분한 경우] -> 잔돈 xxx가 나옵니다.
		 * -> 금액이 부족합니다 [금액이 부족한 경우] -> 잔돈 xxx가 나옵니다.
		 */
	@Data
	@AllArgsConstructor
	public class Beverage {
			private String name;
			private int price;
			private int amount;
		
				
			
		
		
}

