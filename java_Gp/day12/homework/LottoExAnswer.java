package day12.homework;

import java.util.Scanner;

import array.Array;

public class LottoExAnswer {

	public static void main(String[] args) {
		/*로또 번호를 생성하고, 사용자가 번호를 입력하면 몇등인지 출력하는 코드를 작성하세요
		 * 
		 */
		//맞춰야할 숫자 6개를 랜덤으로 생성 + 보너스 1개 숫자(중복X)
		//반복문
		//사용자가 숫자 6개를 입력
		//등수 판별
		
		int lotto[] = new int[7]; //랜덤으로 생성된 로또 번호 저장할 배열
		Array.createRandomArray(1, 45, lotto);
		int lotto2[] = new int[6]; //마지막 한개 보너스로, 앞에 6개는 로또번호
		int bonus = lotto[6];
		int min = 1; int max = 45;
 		
		
		
		
		Array.printArray(lotto);//주석처리 
		System.out.println(lotto[6] + " is bonus number");
		
		
		
	
		Scanner sc = new Scanner(System.in);
		int user[] = new int[6];

		System.out.print("user : ");
		for(int i = 0; i<user.length; i++) {
			user[i] = sc.nextInt();
		}
		
		int count = count(lotto2, user);
		printResult(count, Array.contains(user, bonus, user.length));
		
		
		sc.close();
	}	
		/**로또 번호와 사용자 번호가 주어지면 몇개가 같은지 알려주는 메서드
		 * 매개변수 : 로또번호와 사용자 번호 = int lotto[], int user[]
		 * 리턴타입 : 몇개 같은지 => 정수 => int
		 * 메서드명 : count
		 */
	public static int count(int lotto[], int user[]) {
		
		if(lotto == null || user == null) {
			return 0;
		}
		
		int count = 0;
	    for(int tmp : lotto) {
	    	if(Array.contains(user, tmp, user.length));{
	    		count++;
	    	}	
	    }
		return count;
	}
	/** 일치하는 개수와 보너스 번호와 사용자 번호가 일치하는지 여부를 알려주면
	 *  등수를 출력하는 메서드
	 *  매개변수 : 일치하는 개수, 보너스번호와 일치 여부
	 			=> int count, boolean check Bonus
	 *  리턴타입 : 없음 => void
	 *  메서드명 : printResult
	 */
	public static void printResult(int count, boolean checkbonus) {
		switch(count) {
		case 6: 
			System.out.println("Winner of the lottery");
			break;
		case 5:
			if(checkbonus) {
			System.out.println("Second place in the lottery");
			}else {System.out.println("3rd place in the lottery");
			}
			break;
		case 4:
			System.out.println("4rd place in the lottery");
			break;
		case 3:
			System.out.println("5rd place in the lottery");
			break;
		default:
			System.out.println("Losing ticket!");
		}
	}
}