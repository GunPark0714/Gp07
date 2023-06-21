package day16.homework;

import java.util.Scanner;
public class BeverageMachine {
	
		Scanner sc = new Scanner(System.in);
	
	
	
	
	
	
	public void run() {
		System.out.println("프로그램 시작!");
			int menu = -1;
			int EXIT = 4;
		do {
			printMenu();
		
			menu = sc.nextInt();
			runMenu(menu);
		}while(menu != EXIT);
		System.out.println("프로그램 종료!!");
	}
	


	private void printMenu() {
		System.out.println("==============");
		System.out.println("메뉴 : " );
		System.out.println("1. 금액 투입 ");
		System.out.println("2. 메뉴 선택 ");
		System.out.println("3. 제품 입고 ");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		
	}
	private void runMenu(int menu) {
		System.out.println("=============");
		switch(menu) {
		case 1 : 
			insertmoney();
			break;
		case 2 :
			selectmenu();
			break;
		case 3 :
			store();
			break;
		case 4 :
			break;
		default;
			System.out.println("잘못된 메뉴선택!!");
		
		}

	}
	
	private void insertmoney() {
		System.out.println(" 투입된 금액 : ");
		
	private void selectmenu() {
		
		
	}

}
}
