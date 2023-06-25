package day11.practice;

public class ArrayRandomEx2 {

	public static void main(String[] args) {
		int min = 1, max = 9;
        int [] arr = new int[3];
		
			
		//방법 1 : 9번지까지 있는 배열을 이용
        //장: 작업이 단순  단: 저장공간이 필요
		boolean checkArrayrandom[] = new boolean[10];
		
		for(int i = 0; i<3;  ) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			//checkArrayrandom 배열에 random 번지에 있는 값이 false이면
			if (!checkArrayrandom[random]) {
			//random을 배열에 저장. 
			arr[i] = random;
			//i를 증가. 
			i++;
		    //checkArrayrandom배열에 random번지에 있는 값을 true로 변경
			checkArrayrandom[random] = true;
	}

}
		for(int i = 0; i<3; i++) {
			System.out.println(arr[i]);
		}
		//방법2 : 저장된 값들을 비교
		
		
		int count = 0;//현재 저장된 랜덤수 개수
		int i = 0; // 반복문에서 사용할 변수
		
		while(count < 3) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			//이미 저장된 랜덤수들과 하나하나 비교해서 같은게 있는지 확인하여
			//있으면 반복문 종료
			for(i = 0; i<count; i++) {
				if(random == arr[i]) {
					break;
				}
			}
			/* 위 반복문에서 break를 만나지 않으면 i는 count일 때 종료하기 때문에
			 * 반복문 종료 후 i는 count와 같다.
			 * 하지만 break를 만나서 중간에 빠져나오면 i는 count보다 작다
			 
			if(i == count) {
				arr[count] = random;
				count++;
				//Arrayrandom[count++] = random;
			
			}
		}
		*/
		System.out.println("=================");
		printArray(arr, 3);
		}
	}

		//방법3 : 방법2를 메서드로 변형
		/*count = 0;
		while(count < 3) { 
			int random = (int)(Math.random() * (max - min + 1) + min);
			//중복되지 않으면 배열에 저장 후 count 증가
				if (!contains(arr, random, count)) {
					arr[count] = random;
					count++;
		* 정수형 배열이 주어지면, 정수형 배열의 값을 콘솔에 출력하는 메서드
		 * 매개변수 : 배열, 배열의 갯수 => int Arrayrandom[], int size
		 * 리턴타입 : 없음 => void
		 * 메서드명 : printArray 
		 
				}
		}
		System.out.println("===========");
		printArray(arr);
	}
	*/
	public static void printArray(int arr[], int size) {
    	int i;
		for(i = 0; i<3; i++) {
			System.out.println(arr[i]);
		}
	
	}
	/**정수 num가 배열의 0번지부터 count개만큼 확인했을 때 중복된 값이 있는지 없는지 
	 * 알려주는 메서드
	 * 매개변수 : 중복을 확인할 배열, 비교할 정수 num, 비교할 개수 count
	         => int Arrayrandom[], int num, int count
	 * 리턴타입 : 있는지 없는지 => boolean
	 * 메서드명 : contains
	 *for(i = 0; i<count; i++) {
			if(random == Arrayrandom[i]) {
				break;
			}
		}
		/* 위 반복문에서 break를 만나지 않으면 i는 count일 때 종료하기 때문에
		 * 반복문 종료 후 i는 count와 같다.
		 * 하지만 break를 만나서 중간에 빠져나오면 i는 count보다 작다
		 *
		if(i == count) {
			Arrayrandom[count] = random;
			count++;
			//Arrayrandom[count++] = random;
			
	*/

	
	public static boolean contains (int Arrayrandom[], int num,int count) {
		for(int i = 0; i<count; i++) {
			//중복되면 메서드를 종료하며서 중복됐다고 알려줌
			if(num == Arrayrandom[i]) {
			return true;
			}
		}   
		    //이 위치까지 왔다는건 return true를 못 만났다는 뜻이고, 
		    //그 말은 중복되지 않았다는 뜻
			return false;
			
			
		
		
			
	}
		
	/**min에서 max 사이의 랜덤한 수를 생성해서 배열에 저장하는 메서드
	 * 매개변수 : 최소값, 최대값, 배열 => int min, int max, int ArrayRandom[]
	 * 리턴타입 : 없음 => void
	 * 메서드명 : createRandomArray
	 */
	/*public static void createRandomArray(int min, int max, int ArrayRandom[]) {
		//랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면 메서드를 종료
		//1~3 : 3개가 4개짜리 배열에 중복되지 않게 들어갈 수 없음
		if(max - min + 1 < arr.length) {
			return;
		}
		int count = 0;
		while(count < 3) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			//중복되지 않으면 배열에 저장 후 count증가
			if (!contains(arr, random, count)) {
				arr[count] = random;
				count++;
				*/
			
		
	}
