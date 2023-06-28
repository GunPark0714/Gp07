package day21.homework.updown;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import day21.practice.vo.RecordGame;

public class GameManager implements Program {
		//리터럴 3에 이름을 붙여서 명확하게 전달하기 위해.
		private final static int EXIT = 3;
		//다른 메서드에서 매번 객체를 생성하는게 번거로워서
		
		private Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		System.out.println("Program Start!");
		
		int menu = -1;
		
		do {
			try {
			printMenu();
			menu = sc.nextInt();
			
			runMenu(menu);
			}catch(InputMismatchException e) {
				menu = EXIT-1;//종료 메뉴가 아닌 아무 메뉴를 추가
				sc.nextLine();//앞에서 잘못 입력한 내용을 비워줌
				System.out.println("Wrong Input!");
			}
		}while(menu != EXIT);
	}       

	//기록을 저장하는 리스트
	private ArrayList<RecordGame> list = new ArrayList<>();
	@Override
	public void printMenu() {
		System.out.println("=============");
		System.out.println("1.play");
		System.out.println("2.record");
		System.out.println("3.EXIT");
	
	
	}	

	@Override
	public void runMenu(int menu) {
		System.out.println("================");
		
		switch(menu) {
		case 1:	
		     play();
		     break;
		case 2:
			 recordGame();
			 break;
		case 3:
			 System.out.println("게임을 종료합니다");
			 break;
		default:
			 System.out.println("잘못된 메뉴");
		}		 
	}
	private void recordGame() {
		for(RecordGame tmp : list) {
			System.out.println(tmp);
		}
	}
	public void play() {
		int min = 1, max = 100; 
		int num = min - 1; 
		int random = (int)(Math.random() * (max - min + 1) + min);
		
		System.out.println( "input number");
		int count = 0;
	    while ( num != random){System.out.println("input(1~100) : ");
	    num = sc.nextInt();


    	if ( num > random) {System.out.println( "Down!");}
    	else if( num < random) {System.out.println( "Up!");}
    	else {System.out.println( "Good!");
    	}
    	count++;
	}
	//기록 : 아이디(입력), 플레이 횟수
	//아이디 입력
		System.out.print("Record ID : ");
		String id = sc.next();
		//어떻게 저장해서 관리할 건가?
		RecordGame rec = new RecordGame(id, count);
		list.add(rec);
		//sort();
		list.sort(new Comparator<RecordGame>() {

			@Override
			public int compare(RecordGame o1, RecordGame o2) {
				return o1.getCount() - o2.getCount();
			}
		});
	}
	private void sort() {
		for(int i = 0; i<4
				; i++) {
			for(int j = 0; j<4; j++) {
				if(list.get(j).getCount()>list.get(j+1).getCount()) {
					RecordGame tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
				}
			}
		}
	}
}

	


