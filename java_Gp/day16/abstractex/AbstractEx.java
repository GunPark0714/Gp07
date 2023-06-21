package day16.abstractex;

public class AbstractEx {

	public static void main(String[] args) {
		//추상 클래스를 이용하여 객체를 만들 수 없다.
		//A a = new A();
		/* 구현되지 않은 추상메서드를 객체 생성후에 오버라이딩을 해주면 가능.*/
		A a = new A() {
			public void test() {
				System.out.println("class A Test.");
				
			}
		};
		a.test();
		A a2 = new A() {
			public void test() {
				System.out.println("class A Test.");
			}
		};
		a2.test();
	}

}
/* 추상 클래스는 추상 메서드를 가지고 있음.
 * 추상 메서드가 있는 클래스에 abstract를 붙이지 않으면 에러 발생
 * 
 */
abstract class A{
	
	public abstract void test();
}
/* 추상 클래스 상속 받는 방법1.
 * 추상클래스 A를 상속받은 자식 클래스는 추상 클래스로 만들어야함. */
abstract class childA1 extends A{
	
}
/** 추상 클래스 상속 받는 방법2.
 * 부모 클래스의 추상 메서드를 오버라이딩 해서 재정의 해줌
 */
class childA2 extends A{

	@Override //@Override 생략가능
	public void test() {
		System.out.println("테스트");
 
	}
	
}