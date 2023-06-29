package day22.practice.controller;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

import day22.practice.vo.Student;

public class StudentManager3 implements Program{
	private final static int EXIT = 4;
	private Scanner sc = new Scanner(System.in);
	
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
		
		Stream<Student> stream = list.stream();
		System.out.println("================");
		switch(menu) {
		case 1:	
			stream.forEach(std->System.out.println(std));
			break;
		case 2:
			//검색할 학년 입력
			System.out.println("grade : ");
			final int grade1 = sc.nextInt();
			
			stream
			/* Filter는 매개변수로 Predicate 인터페이스의 객체가 필요
			 * Predicate를 구현한 익명 클래스를 람다식으로 만든 후에 객체를 생성해서 전달
			 * std는 매개변수 이름이기때문에 다른 이름으로 수정해도 됨
			 */
				.filter(std->std.getGrade() == grade1)
				.forEach(std->System.out.println(std));
			break;
		
		case 3:	
			//검색할 학년, 반, 번호 입력
			System.out.print("grade : ");
			final int grade2 = sc.nextInt();
			System.out.print("class : ");
			final int classNum2 = sc.nextInt();
			System.out.print("number : ");
			final int num2 = sc.nextInt();
			stream
				.filter(std->std.equals(new Student(grade2, classNum2,num2, null)))
				.forEach(std->System.out.println(std));
				break;
				
				
		case 4:	
			break;
		default:
			System.out.println("잘못된 메뉴!");
		}
	}
	
	private void print(Predicate<Student> p) {
		for(Student tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}
}
