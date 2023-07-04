package day25.indiprac.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day25.indiprac.vo.Student;
import day25.indiprac.vo.StudentList;

public class StudentManager implements Program{

		/*학생 관리 프로그램을 작성하세요.
		 * 기능 : 학생 등록, 학생 확인, 종료
		 * 학생 : 이름 학번 과
		 */
		
		List <Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		private final static int EXIT = 4;
		@Override
		public void printmenu() {
			System.out.println("============");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 확인");
			System.out.println("3. 종료");
			
		}
		@Override
		public void run() {
			int menu;
			do {
				System.out.println("==============");
				printmenu();
				menu = sc.nextInt();
				runmenu(menu);
				System.out.println("==============");
			}while(menu != EXIT);
		}
		@Override
		public void runmenu(int menu) {
			switch(menu) {
			case 1 : 
				 inputStudent();
				 break;
			case 2 :
				 printStudent();
				 break;
			case 3 :
				 break;
		    default : System.out.println("wrong input");
			}
			
		}
		private void inputStudent() {
			System.out.println("Input student info");
			System.out.println("Student name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Student num : ");
			String num = sc.nextLine();
			System.out.println("Student major : ");
			String major = sc.nextLine();
			
			Student std = new Student(name, num, major);
			if(!list.contains(std)) {
				list.add(std);
				System.out.println("학생 추가 완료!");
			}
			else {System.out.println("학생 추가 실패!");
		}
	}		
		private void printStudent() {
			System.out.println("Input student info");
			System.out.println("Student name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Student num : ");
			String num = sc.nextLine();
			System.out.println("Student major : ");
			String major = sc.nextLine();
		
			Student tmp = new Student(name, num, major);
			if(list.contains(tmp)) {
				System.out.println("학생 검색 성공 : " + tmp);
			}
			else {System.out.println("학생 정보 확인 실패!");
			}
		}
}