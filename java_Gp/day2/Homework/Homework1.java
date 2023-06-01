package day2.Homework;

import java.util.Scanner;

public class Homework1
{
  public Homework1() {}
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("정수2개와 문자(산술연산자)를 입력하세요");
    int num1, num2; 
    char operator;

    num1 = sc.nextInt();
    operator = sc.next().charAt(0);
    num2 = sc.nextInt();
    System.out.println("" + num1 + operator + num2);
    
    sc.close();
  
    
    
  }
}
