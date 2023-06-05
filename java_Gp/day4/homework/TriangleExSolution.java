package day4.homework;

import java.util.Scanner;
public class TriangleExSolution {

	public static void main(String[] args) {
		
	int a, b, c;
	int max;
	Scanner sc = new Scanner(System.in);
    System.out.println("input 3 integer numbers");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    
    //삼각형 가능 여부를 확인 및 출력
    //세변 중 가장 큰 변의 길이를 계산
    //a > b 보다 크면
    if (a > b) { 
    	
    	  if(a > c) {max = a;}
       //a > c a를 max에 저장
    	  else {max = c;}
    	  
    }
       //아니면 c를 max에 저장
    
    //b가 c보다 크면 max에 b를 저장
    
    // 아니면 max에 c를 저장
    else if(b > c) { max = b;}
   
    	 
    	 
    	 
    
    else {max = c;} 
    // max = a > b ? (a > c ? a : c) : (b > c ? b : c);
    // 작은 두변의 합 > max
    // 세변의 합 - max == 작은 두변의 합
    // 세변의 합에서 max를 뺀 값이 max보다 크면 삼각형이라고 출력 
    System.out.println(max);
        
    
    
    sc.close();    
	}

}
