package day22.practice.run;

import java.util.ArrayList;

import day22.practice.controller.StudentManager3;
import day22.practice.vo.Student;
public class LambdaStudentEx {

	public static void main(String[] args) {
		/* 학생 정보를 출력하는 기능을 구현하세요.
		 * 1. 학생 전체 출력
		 * 2. 학생 학년 출력
		 * 3. 학생 검색 출력
		 * 4. 종료
		 */
		StudentManager3 sm = new StudentManager3();
		sm.run();
	
		
	
		//학생 전체 출력
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,1,1,"Hong"));
		list.add(new Student(1,1,2,"Ling"));
		list.add(new Student(1,1,3,"Park"));
		list.add(new Student(1,1,4,"Lee"));
		list.add(new Student(1,1,5,"Kim"));
	}
}
		//학생 학년 출력
		//학생 검색 출력
		

	
