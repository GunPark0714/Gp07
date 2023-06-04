package day4.ifex;

public class NestedIfEx {

	public static void main(String[] args) {
	/* 2, 3, 6의 배수 판별 예제 
	 * (day4. practice package에 IfmultipleEx2 문제)*/
	 
		int num = 2;
		//2의 배수 (2,4,6,8,10,12..)
		if(num % 2 == 0) {System.out.println("is multiple of 2");}
		//2의 배수이면서 3의 배수 ==> 6의 배수(6,12,18..)
			if(num % 3 == 0) {System.out.println( "is multiple of 6");}
		//아닌수 ==> 2의 배수(2,4,8,10...)
		else {System.out.println( "is multiple of 2" );}	
	    //3의 배수
		if( num % 3 == 0) {System.out.println( "is multiple of 3");}
		//아닌수
		else {System.out.println( "is not multiples of 2,3,6 ");}
		
		
		
		
	}
}
		

