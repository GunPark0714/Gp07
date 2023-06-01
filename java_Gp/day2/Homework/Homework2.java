package day2.Homework;

import java.io.PrintStream;
import java.util.Scanner;








public class Homework2
{
  public Homework2() {}
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    //콘솔에서 입력받을 수 있는 스캐너 생성
    System.out.println("두 정수를 입력하세요");
    //안내 문구 출력
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    //두 정수를 입력받음
    int sum = num1 + num2;
    int sub = num1 - num2;
    int mul = num1 * num2;
    double div = num1 / num2;
    int mod = num1 % num2;
    //두 정수의 산술 연산을 계산 , 결과를 콘솔에 출력
   
    System.out.println(num1 + "+" + num2 + "=" + sum);
    System.out.println(num1 + "-" + num2 + "=" + sub);
    System.out.println(num1 + "*" + num2 + "=" + mul);
    System.out.println(num1 + "/" + num2 + "=" + div);
    System.out.println(num1 + "%" + num2 + "=" + mod);
   //%는 +보다 우선순위가 높기 때문에 ()을 생략해도 되지만 위에 +와 같은 형태로 보여주기 위해 ()를 붙임
    sc.close();
  }
}
