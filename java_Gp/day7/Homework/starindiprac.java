package day7.Homework;

public class starindiprac {

	public static void main(String[] args) {
		/*           *               i = 1  공 = 3      , 별 = 1
 		 *          ***              i = 2  공 = 2      , 별 = 3
		 *         *****             i = 3  공 = 1      , 별 = 5
		 *        *******            i = 4  공 = 0      , 별 = 7
		 *         *****             i = 5  공 = 1      , 별 = 5
		 *          ***              i = 6  공 = 2        별 = 3
		 *           *               i = 7  공 = 3        별 = 1
		 */
		
		int num = 11;
		
		for(int i=1;i<=num;i++) {
			int half = (num+1)/2;
			if(i<=half) {
				for(int j=1;j<=half-i;j++) {
					System.out.print(' ');
				}
			    for(int j=1;j<=i*2-1;j++) {
			    	System.out.print("*");
			    }
			    System.out.println();
			}
		    else {
		    	for(int j=1;j<=i-half;j++) {
		    		System.out.print(' ');
		    	}
		    	for(int j=1;j<=2*(num-i)+1;j++) {
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
		}
	}
}