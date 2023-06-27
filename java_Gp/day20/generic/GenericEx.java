package day20.generic;

import java.util.Scanner;

public class GenericEx {

	public static void main(String[] args) {
		//Wrapper class : 기본자료형을 클래스로 만들어서 사용 */
		//객체를 선언할 때 타입을 지정해줘야함(<클래스명>=>Wrapper클래스 필요)
		//생성자는 타입 생략가능하지만 넣어주는게 좋음
		
		Student<Integer>std = new Student();
		std.kor = 10; //10.0을 넣어주면 에러가 발생
		Student<Double> std2 = new Student<Double>();
		std2.kor = 10.0; //
		/*Student<Scanner> std3 = new Student<>();
		std3.kor = 10;
		*/
		print(std2);
		GenericEx.<Double>print(std2);
		GenericEx.print(std2);// std2가 Double로 되어 있어서 print의 T를 Double이라고 추정가능	
	}
	
	
	//학생 정보를 출력하는 메서드
	public static <T extends Number> void print(Student<T> std) {
		System.out.println(std.grade);
		System.out.println(std.classNum);
		System.out.println(std.num);
		System.out.println(std.name);
		System.out.println(std.kor);
		
		
	}
}
