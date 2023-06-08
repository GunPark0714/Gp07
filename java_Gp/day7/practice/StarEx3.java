package day7.practice;

public class StarEx3 {

	public static void main(String[] args) {
		/*     *    i = 1 공=4 *=1
 		 *    **    i = 2 공=3 *=2
		 *   ***    i = 3 공=2 *=3
		 *  ****    i = 4 공=1 *=4
		 * *****    i = 5 공=0 *=5
		 *                공=? *=i
		 */
		
		
		
		
		for (int i = 1; i<=5; i++) {
			 
			
			for(int j = 1; j<=i; j++ ) {
				System.out.print('*');
			}
			
			
			
			for(int j = 1; j<=i-1; j++) {
				System.out.print('*');
			}
			System.out.println();
	}
}
}

