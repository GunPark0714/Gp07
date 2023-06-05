package day5.whileEx;

public class HelloworldEx {

	public static void main(String[] args) {
		System.out.println("Hello world");
		//Hello world 를 10번 출력하는 코드를 작성하세요.
		/* 반복횟수 : 10번, 1번부터 10번까지 1씩 증가
		 * => 변수의 초기값 : 1
		 * => 조건식 : 10까지 => 10돠 작거나 같을때까지
		 * => 증가하는 식 : 1씩 증가
		 * 규칙성 : Hello world 를 출력 
		 * => 실행문
		 */
	
		int max = 3;
		int i = max;
		 //변수의 초기값 : 1
		while( i <= max) {i++;}
		System.out.println( "Hello world" );
		// ++i, i++, 1 = i+1, i+=1
        
		System.out.println("=================");
		/* 반복횟수 : i는 10부터 1까지 1씩 감소
		 * 
		 */
	    i = max;
		while(i-- > 0) {
		System.out.println("===============");}
		

}
}
