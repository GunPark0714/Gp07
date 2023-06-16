package day12.homework;

import array.Array;
import java.util.Scanner;

public class LottoEx {

	public static void main(String[] args) {
		/*로또 번호를 생성하고, 사용자가 번호를 입력하면 몇등인지 출력하는 코드를 작성하세요
		 * 
		 */
		//맞춰야할 숫자 6개를 랜덤으로 생성 + 보너스 1개 숫자(중복X)
		//반복문
		//사용자가 숫자 6개를 입력
		//등수 판별
		
		int DrawNum[] = new int[7]; //랜덤으로 생성된 로또 번호 저장할 배열
		int	UserNum[] = new int[6]; //사용자가 입력한 로또 번호 저장할 배열
		int min = 1; int max = 45;
 		int arr[] = null;
 		int winning = 0;
		int winning2 = 0;
		int winningb = 0;
		
		Scanner sc = new Scanner(System.in);
		
		arr = Array.createRandomArray(1, 45, DrawNum);
		Array.printArray(DrawNum);//주석처리 
		System.out.println(DrawNum[6] + " is bonus number");
	 
		printResult(winning, winning2, winningb);
	    
		
		do { 
			// 사용자가 숫자 6개를 입력
			System.out.println("user : ");
			for(int i = 0; i<UserNum.length; i++) {
				UserNum[i] = sc.nextInt();
		}
			//판별
	
		winning = winning(DrawNum,UserNum);
		
		} while( winning < 6 || winning2 < 6);	
		System.out.println("congratulations!");
	}
	    /** 당첨된 로또번호와 보너스 번호를 판별하는 메서드
	     * 매개변수 : 두 배열 int arr1[], int arr2[]
	     * 리턴타입 : 같은 숫자가 몇개 있는지 -> 몇개 -> 정수 -> int
	     * 메서드명 : winning
	     */
	public static int winning(int arr1[],int arr2[]) {
		if(arr1 == null || arr2 == null){//예외처리 
				return 0;	
		}
		int size = arr1.length < arr2.length ? arr1.length : arr2.length;
		int count = 0;
		for(int i = 0; i<size; i++) {
			if(arr1[i] == arr2[i]) {
				count++;
			
		}
	}   
		return count;
	}
	public static int winning2(int arr1[],int arr2[]) {
		if(arr1 == null || arr2 == null) {
			return 0;
		}
   		int count = 0;

   		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0;j<arr2.length; j++) {
				if(i == j) {
					continue;
				}
				if(arr1[i] == arr2[i]) {
					count++;
				}
			}
   		}
		return count;
	}
	public static int winningb(int arr1[], int arr2[]) {
		if(arr1 == null || arr2 == null) {
			return 0;
	}
		int count = 0;
		for(int i = 0; i<arr1.length;i++) {
			if(arr1[i] == arr2[6]) {
				count++;
			}
		}
			return count;
	}
	public static void printResult(int winning, int winning2,int winningb){

	   if(winning + winning2 == 3) {
		   System.out.println("division5");
	   }
	   if(winning + winning2 == 4) {
		   System.out.println("division4");
	   }
	   if(winning + winning2 == 5) {
		   System.out.println("division3");
	   }
	   if(winning + winning2 == 5 && winningb == 1 )  {
		   System.out.println("division2");
	   }
	   if(winning + winning2 == 6 ) {
		   System.out.println("division1");
	   }
	   else {
		   System.out.println( "unlucky");
	   }
	   System.out.println();
	   }
	
	}




