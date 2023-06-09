package day8.method;


public class MethodCallStackEx {

	public static void main(String[] args) {
		/* 함수(메소드) 호출 스택 에제 */
	    method1(1);
	    //method4();//재귀 메소드를 잘못 작성한 경우 StackOverFlow가 발생합니다....
	}
    public static void method1(int a) {
    	System.out.println(a);
    	method2(a);
    }
    public static void method2(int a) {
    	System.out.println(a-1);
    	method3();
    }
	public static void method3() {
    	System.out.println("end");
	}
    public static void method4() {
    	System.out.println("a");
    	method4();
    
    /*
     * 메서드 오버로딩******
     * 동일한 이름의 메소드가 여러개인 경우를 메서드 오버로딩이라고 함.
     * 매개변수가 다른데 기능은 같은 경우 메서드 오버로딩을 지원하지 않으면 같은 기능에서 이름만 다른 메서드가 여러개 만들어짐
     * 조건 : 1. 매개변수의 개수가 다름 2. 매개변수의 타입이 다름 (결론 : 매개변수가 다름)
     */
   
    }
}
