package day16.homework;

public class BeverageMachineEx {

	public static void main(String[] args) {
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
	}
		int menu2 = 0;
		int 투입금액;
		int 콜라; 
		int 사이다;
		int 환타;
		public BeverageMachineEx(int 투입금액, int 콜라, int 사이다, int 환타) {
			
			this.투입금액 = 투입금액;
			this.콜라 = 콜라 = 1200;
			this.사이다 = 사이다 = 1300;
			this.환타 = 환타 = 1400;
		}
		

		
		
		
		
	private void checkbeverage() {
		if(menu2 == 1) {
			if(투입금액 >= 콜라) { 
				System.out.println("콜라가 나옵니다. 잔돈" + (money - Bvr1) + "가 나옵니다.");}
				else System.out.println("금액이 부족합니다. 잔돈" + money + "가 나옵니다.");
			}
		if(menu2 == 2) {
			if(투입금액 >= 사이다) 
				System.out.println
		}
			}
		}
		
	}
}
