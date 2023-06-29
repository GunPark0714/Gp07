package day22.lambda;

import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		Consumer<String> consumer = s ->
		System.out.println(s);
		consumer.accept("Hong");
		consumer<Student> consumer2 = s > System.out.println(s.getName());
		Student std = new Student(1,1,1,"Hong");
		consumer2.accept(std);
	}
	
		public static void printStudent(Student std) {
			System.out.println(std);
		}
		printStudent(std);
		}
@Data
@AllArgsConstructor
	class Student{
		int grade, classNum, num;
		String Name;
	}
		//학생 전체 정보 출력
		public static void 	printStudent(Student std)}{
		System.out.println(std);
		}
		//학생 이름 출력
		public static void printStudentName(Student std) {
			System.out.println(std.Name);
		}
		public static void 
