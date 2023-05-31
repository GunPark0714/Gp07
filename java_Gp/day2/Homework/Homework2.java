package day2.Homework;

import java.io.PrintStream;
import java.util.Scanner;








public class Homework2
{
  public Homework2() {}
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("두 정수를 입력하세요");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    int sub = num1 - num2;
    int mul = num1 * num2;
    double div = num1 / num2;
    int mod = num1 % num2;
    
    String str1 = num1 + "+" + num2 + "=" + sum;
    System.out.println(str1);
    String str2 = num1 + "-" + num2 + "=" + sub;
    System.out.println(str2);
    String str3 = num1 + "*" + num2 + "=" + mul;
    System.out.println(str3);
    String str4 = num1 + "/" + num2 + "=" + div;
    System.out.println(str4);
    String str5 = num1 + "%" + num2 + "=" + mod;
    System.out.println(str5);
  }
}
