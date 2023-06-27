package day20.practice.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import day20.practice.vo.Student;

public class StudentController implements Program{

	private final static int EXIT = 5;
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Student> list = new ArrayList<Student>();
	
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
		public void printMenu() {
			System.out.println("================");
			System.out.println("Menu");
			System.out.println("1.학생 추가");
			System.out.println("2.학생 삭제");
			System.out.println("3.학생 수정");
			System.out.println("4.학생 목록 조회");
			System.out.println("5.프로그램 종료");
		}
		@Override
		public void runMenu(int menu) {
			System.out.println("================");
			
			switch(menu) {
			case 1:	
				addStudent();
				break;
			case 2:
				deleteStudent();
				break;
			case 3:	
				updateStudent();
				break;
			case 4:	
				printStudent();
				break;
			default:
				System.out.println("잘못된 메뉴!");
			}
		}
		public void addStudent() {
			System.out.println("학생 정보 추가");
			System.out.print("학생명 : ");
			sc.nextLine(); //number를 입력하고 난 뒤 엔터를 처리하기 위해
			String name = sc.nextLine();
			System.out.println("학년 : ");
			int grade = sc.nextInt();
			System.out.println("반 : ");
			int classNum = sc.nextInt();
			System.out.println("번호 : ");
			int num = sc.nextInt();			
			//학생 객체 생성
			Student std = new Student(grade, classNum, num, name);
			//학생 리스트에 추가
			//학생이 있는지 없는지 확인해서 없으면 추가
			if(!list.contains(std)) {
				list.add(std);
			System.out.println("학생 추가 완료!");
				return;
			}
			System.out.println("학생 추가 실패!");
		}
		public void deleteStudent() {
			//삭제할 학생 정보를 입력(학년, 반, 번호)
			System.out.println(" 학년 : ");
			int grade = sc.nextInt();
			System.out.println("반 : ");
			int classNum = sc.nextInt();
			System.out.println("번호 : ");
			int num = sc.nextInt();	
			//삭제할 학생정보를 이용하여 학생 객체를 생성
			Student tmp = new Student(grade, classNum, num, null);
			
			//삭제를 시도해서 성공하면 성공했다고, 실패하면 실패했다고 알려줌
			if(list.remove(tmp)) {
				//삭제 성공
				System.out.println("삭제 성공");
				return;
			}
			System.out.println("삭제 실패");
		}	
		public void updateStudent() {
			//수정할 학생의 정보 입력(학년, 반, 번호)
			System.out.println(" 학년 : ");
			int grade = sc.nextInt();
			System.out.println("반 : ");
			int classNum = sc.nextInt();
			System.out.println("번호 : ");
			int num = sc.nextInt();		
			Student tmp = new Student(grade, classNum, num, null);
			//수정할 학생이 있는지 없는지 확인.
			int index = list.indexOf(tmp);
			if(index == -1) {
				System.out.println("Update fail!!");
				return;
			}
			
			//없으면 종료
			
			//수정될 학생 정보를 입력(학년, 반, 번호, 이름)
			System.out.println(" 학년 : ");
			grade = sc.nextInt();
			System.out.println("반 : ");
			classNum = sc.nextInt();
			System.out.println("번호 : ");
			num = sc.nextInt();	
			sc.nextLine(); //number를 입력하고 난 뒤 엔터를 처리하기 위해
			String name = sc.nextLine();
		
			//학생 정보를 수정
			//수정될 학생 정보가 이미 있는 학생인지 확인
			//수정될 정보를 이용하여 학생 객체를 생성
			tmp = new Student(grade, classNum, num, name);
			//학년, 반, 번호가 일치하는 학생이 있는지 확인해서 있으면 종료
			if(list.contains(tmp)) {
				System.out.println("업데이트 실패!");
				return;
			}
			list.get(index).update(grade, classNum, num, name);
		}
		public void printStudent() {
			System.out.println(list);
		}
}		
