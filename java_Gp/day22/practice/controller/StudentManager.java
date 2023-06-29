package day22.practice.controller;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import day22.practice.vo.Student;

public class StudentManager implements Program{
	
	
	/* 학생 정보를 출력하는 기능을 구현하세요.
	 * 1. 학생 전체 출력
	 * 2. 학생 학년 출력
	 * 3. 학생 검색 출력
	 * 4. 종료
	 */
	
	
	
	
	
	private	List<Student> list = Arrays.asList(
			new Student(1,1,1,"Hong"),
			new Student(1,1,2,"Ling"),
			new Student(2,1,1,"Park"),
			new Student(3,1,1,"Lee"),
			new Student(3,3,2,"Kim")
	);
	private Scanner sc = new Scanner(System.in);
	private final static int EXIT = 4;
	
	@Override
	public void printMenu() {
		System.out.println("1.학생 전체 출력");
		System.out.println("2.학생 학년 출력");
		System.out.println("3.학생 검색 출력");
		System.out.println("4.종료");
		System.out.println("Select : ");
			
	}

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

	

	@Override
	public void runMenu(int menu) {
		System.out.println("================");
		int grade =1; int classNum =1; int num=1;
		switch(menu) {
		case 1:	
			printStudent();
			break;
		case 2:
			//검색할 학년 입력
			System.out.println("grade : ");
			printGrade(grade);
			break;
		case 3:	
			//검색할 학년, 반, 번호 입력
			System.out.print("grade : ");
			grade = sc.nextInt();
			System.out.print("class : ");
			classNum = sc.nextInt();
			System.out.print("number : ");
			num = sc.nextInt();
			printSearch(grade, classNum, num);
			break;
		case 4:	
			break;
		default:
			System.out.println("잘못된 메뉴!");
		}
	}
	

	public void printStudent() {
		for(Student tmp : list) {
			System.out.println(tmp);
		}
	}

	public void printGrade(int grade) {
		for(Student tmp : list);
		
	}
	public void printSearch(int grade, int classNum, int num) {
		for(Student tmp : list) {
			if(tmp.equals(new Student(grade, classNum, num, ""))) {
				System.out.println(tmp);
			}
		}
	}

}
