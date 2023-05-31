package day2.scanner;

import java.io.PrintStream;

public class ScannerEx
{
  public ScannerEx() {}
  
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    System.out.println("정수를 입력해주세요.");
    int num1 = sc.nextInt();
    System.out.println(num1);
    
    System.out.println("실수를 입력해주세요.");
    double num2 = sc.nextDouble();
    System.out.println(num2);
    
    System.out.println("문자열1을 입력하세요.");
    sc.nextLine();
    String str1 = sc.nextLine();
    System.out.println(str1);
    
    System.out.println("문자열2를 입력하세요.");
    String str2 = sc.next();
    System.out.println(str2);
    
    System.out.println("문자를 입력하세요.");
    

    char ch = sc.next().charAt(0);
    System.out.println(ch);
    
    sc.close();
  }
}
