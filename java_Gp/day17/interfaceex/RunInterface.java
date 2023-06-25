package day17.interfaceex;

public interface RunInterface {
	/*public final static */ int NUM = 10;//클래스 상수 => 클래스를 이용하여 호출 
	/*public abstract*/ void run(); //void앞에 abstract 가 자동으로 들어감
	default void stop() {
		System.out.println("Program stop!");
	}
}	
