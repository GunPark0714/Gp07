package day25.indiprac.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
			load();
			do {
				System.out.println("==============");
				printmenu();
				menu = sc.nextInt();
				runmenu(menu);
				System.out.println("==============");
			}while(menu != EXIT);
			save();
			
					
		}
		private void save(String fileName) {
			//학생 정보를 저장 => 리스트 => 하나씩 꺼내서 저장 
			//저장 => OutputStream
			//객체단위로 저장 => ObjectOutputStream
			try(
					FileOutputStream fos = new FileOutputStream(fileName);
					ObjectOutputStream oos = new ObjectOutputStream(fos)){
						for(Student tmp : list) {
							oos.writeObject(tmp);
						}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		private void load(String fileName() {
			//학생 정보를 출력
		
		try(ObjectInputStream ois 
				= new ObjectInputStream(fileName())){
				while(true) {
					Student tmp = (Student)ois.readObject();
					list.add(tmp);
				}
		}
		} catch (FileNotFoundException e) {
			System.out.println("불러올 파일이 없습니다");
		} catch (EOFException e) {
			System.out.println("불러오기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//ObjectInputStream을 이용하여 객체단위로 읽어올 떄 클래스가 Serialiazable 인터페이스를 
			//구현하지 않으면 발생 
			System.out.println("Student 클래스를 찾을 수 없습니다.");
		} 
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