package day9.classEx;

public class Class정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*클래스는 멤버변수, 메서드, 생성자로 구성.
	 *멤버변수 : 속성
	 *메서드 : 기능
	 *ex) 자동차  -> 클래스 
	 *    속력을 올림 -> 메서드
	 *    자동차 색상이 검은색 -> 멤버변수
   	 *    공장에서 막 나온 자동차 -> 생성자
	 *    
	 *    
	 *    
	 */

}/* 클래스
* 다양한 타입 변수로 하나의 정보를 나타낼 때 사용
* 관리를 편하게 하기 위해
  => 기능을 가짐
  
  - 정보 : 멤버변수 
  - 기능 : 메서드 ( 리턴타입 메서드명 (매개변수들){
            구현; 
			return xx;
}

접근제어자 
- public : 전부 
- protected : 나 + 같은패키지에 있는 클래스 + 자식클래스
- default : 나 + 같은 패키지에 있는 클래스
- private : 나

- 일반적으로 멤버변수의 접근제어자는 private
 => getter /setter => @Data
- 일반적으로 메서드는 접근제어자는 public (간혹 private을 씀)

누구를 멤버변수로? 
A는 B를 가지고 있다로 표현되면 B는 A의 멤버변수
학생은 이름을 가지고 있다.
학생은 학년을 가지고 있다.
학생은 반을 가지고 있다.
has a 관계 : 멤버


static 멤버 변수 (클래스 멤버변수)
 - 모든 객체가 공유. 멤버변수가 1개만 존재(객체 100이더라도 static멤버는 1개)
 - 클래스를 통해 호출
 멤버 변수 (객체 멤버변수)
 -객체가 100개이면 멤버변수도 100개
 -객체를 톻해 호출
 
 메서드오버로딩 : 같은 이름의 메서드가 여러개 있는 경우 
 - 매개변수가 다르면 됨(변수명 x)
*
void a(int num1){}    ===>  오버로딩 불가( 변수명만 다르기 떄문에 안됨)
void a(int num2){}

void a(int num1){}    =======> 오버로딩 가능 (변수타입만 다르기 떄문에)
void a(double num1){}

this:자신을 가르키는 예약어
-메서드나 생성자에서 매개변수가 멤버변수의 이름이 같을때 구분하기 위해 반드시 사용
this(): 같은 클래스에 있는 다른 생성자를 호출 
*
**/

