package day18.practice;

public class StringIndexOfEx {

	public static void main(String[] args) {
	
		
		String str = "Hello world";
		int count = 0;
		String search = "L";
		int index = -1;
		//반복 : 찾으면 반복
		do { 
		//Hello world l의 위치를 찾음 => lo world에서 l의 위치를 찾음 => o world에서 l의 위치를 찾음
			//=>d에서 l의 위치를 찾음
			index = str.indexOf(search, ++index);
			//찾았으면 개수를 증가
			if(index != -1) {
				count++;
			}
		}while(index != -1);
		//개수를 출력
		System.out.println(str + " : " + search + " : " + count);
	
		
		
		

	   
		
	}


}