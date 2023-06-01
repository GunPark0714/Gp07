package day3.operator;

public class ArithmeticEx {

	public static void main(String[] args) {
		/* byte + 정수나 char + 정수는 결과가 int여서 byte나 char에 바로 저장할 수 없음 
		 * 자료형 변환을 이용해서 저장해야 한다.
		 */
		byte num1 = 3;
		num1 = (byte)(num1 + 5);
		char ch = 'A';
		System.out.println(ch);
		ch = (char)(ch + 1);
		System.out.println(ch);
		int num2 = 3;
		num2 = (int)(num2 + 4.0);
		
	
		
	}

}

/*성적을 입력받아 입력받은 성적이 60점이상 이상인지 확인하는 코드를 작성하세요

예 : input score :
	
	65
	
    do you pass 65 points? true
    
    input score :
    
    45

    do you pass 45 points? false 

*/