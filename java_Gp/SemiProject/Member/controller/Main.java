package SemiProject.Member.controller;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		int menu;
		final int EXIT = 9;
		Scanner sc = new Scanner(System.in);
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			System.out.println("=================");
		}while(menu != EXIT);

	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			System.out.println("[로그인]");
			MemberLogin();
			break;
		case 2:
			System.out.println("[회원가입]");
			MemberJoin();
			break;
		case 3:
			System.out.println("[아이디/비밀번호 찾기]");
			findidpw();
			break;
		case 4:
			System.out.println("[?]");
			break;	
		case 5:
			System.out.println("[?]");
			break;	
		case 6:
			System.out.println("[?]");
			break;
		case 7:
			System.out.println("[?]");
			break;
		case 8:
			System.out.println("[?]");
			break;
		case 9:
			System.out.println("[게임을 종료합니다.]");
			break;
		default:
			System.out.println("[올바른 번호를 입력해 주세요.]");	
		
		}
	}
	private static void MemberLogin() {
		
	}
	
	private static void MemberJoin() {
		
	
	}

	private static void findidpw() {
		
	
	}

	
	private static void printMenu() {
		System.out.println("=================");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 아이디/비밀번호 찾기");
		System.out.println("4. ?");
		System.out.println("5. ?");
		System.out.println("6. ?");
		System.out.println("7. ?");
		System.out.println("8. ?");
		System.out.println("9. 종료");
		System.out.println("=================");
		System.out.print("메뉴 선택 : ");
	}
		
	
}
