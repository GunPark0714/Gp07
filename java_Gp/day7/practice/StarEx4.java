package day7.practice;

public class StarEx4 {

	public static void main(String[] args) {
		/*     *    i = 1 공=4 *=1   *= 0
 		 *    ** *    i = 2 공=3 *=2  *= 1
		 *   *** **    i = 3 공=2 *=3   *=2
		 *  **** ***    i = 4 공=1 *=4   *=3
		 * ***** ****    i = 5 공=0 *=5   *=4
		 *                공=? *=i   *=i      *=i-1
		 */
		
		

		for (int i = 1; i<=5; i++) {
		    
			
			
			for(int j = 1; j<= 5-i; j++) {
				System.out.print(' ');
			}
			
			System.out.println();
	}

}}
