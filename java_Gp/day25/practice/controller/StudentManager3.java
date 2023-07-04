package day25.practice.controller;

import java.util.ArrayList;
import java.util.Scanner;

import day25.practice.vo.Student;
import day25.practice.vo.StudentList;
public class StudentManager3 implements Program{
	
	/*학생 관리 프로그램을 작성하세요.
	 * 기능 : 학생 등록, 학생 확인, 종료
	 * 학생 : 이름 학번 과
	 */
	
	
	
	
	//메뉴 입력
	//종료 메뉴 입력 고정
	private ArrayList<Student> list = new ArrayList<Student>();
	private Scanner sc = new Scanner(System.in);
	private final static int EXIT = 4;
	private StudentList sl = new StudentList();
	//StudentList 클래스 생성 후 가져옴
	
	
	//메뉴출력	
	@Override
	public void printMenu() {
			System.out.println("1. Insert Student");
			System.out.println("2. Print Student");
			System.out.println("3. Print All Student");
			System.out.println("4. EXIT");
			System.out.println("Select : ");
	}
	//메뉴실행
	@Override
	public void run() {
		int menu;
		do {
			System.out.println("============");
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			System.out.println("============");
		}while(menu != EXIT);
				
	}
	//메뉴에 따른 메서드 실행
	@Override
	public void runMenu(int menu) {
		switch(menu) {
		//1번 메뉴 선택시 학생등록 메서드 실행
		case 1 : 
			Insert();
			break;
		//2번 메뉴 선택시 학생정보 확인 메서드 실행
		case 2 :
			Print();
			break;
		//3번은 목록 확인
		case 3 :
		    Printlist();
		    break;
		//4번은 종료
		case 4 :
			System.out.println("EXIT");
			break;
		//잘못된 입력
		default : 
			System.out.println("Wrong menu");
			
		}
	}
	private void Printlist() {
		for(Student tmp2 : list) {
			System.out.println(tmp2);
		}
	}
	private void Insert() {
		 //학생 정보 입력 메뉴 출력
		 System.out.println("Insert Student");
		 System.out.println("name : ");
		 sc.nextLine();
		 String name = sc.nextLine();
		 System.out.println("num : ");
		 String num = sc.nextLine();
		 System.out.println("major : ");
		 String major = sc.nextLine();
		 
		 //학생 객체 생성
		 Student std = new Student(name, num, major); 
		 //배열을 Student 클래스에서 불러옴
		 //학생정보를 배열리스트에 추가
		 if(!list.contains(std)){
			 list.add(std);
			 System.out.println("학생 추가 완료");
		 }
		 else {System.out.println("학생 추가 실패!");
		
	 }
}
	private void Print() {
		//검색할 학생 입력 메뉴 출력
			System.out.println("Insert Student");
			System.out.println("name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("num : ");
			String num = sc.nextLine();
			System.out.println("major : ");
			String major = sc.nextLine();
			//검색할 새 학생 객체 생성
			
			//이름만 입력이 안되고 출력이 안됨
			/*for(Student tmp : list) {
				if(tmp.equals(new Student(name, num, major))) {
					System.out.println("학생 검색 성공 : " + tmp);
			*/
			//contains 사용. 이것도 안됨 뭐가 문제??
			Student tmp = new Student(name, num, major);
			if(list.contains(tmp)) {
				System.out.println(" 학생 검색 성공 : " + tmp);
				
			/*index 사용
		    int index = list.indexOf(tmp);
		    if(index > -1) {
		    	System.out.println("학생 검색 성공 : " + tmp);
		    }
		    else {System.out.println("학생 검색 실패 ");
		    */
		}
			else {
				 System.out.println("학생 검색 실패");
			}
		}
	}		
	

		
		
		


