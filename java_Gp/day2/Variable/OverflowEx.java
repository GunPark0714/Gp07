package day2.Variable;

import java.io.PrintStream;

public class OverflowEx { public OverflowEx() {}
  public static void main(String[] args) { byte num = Byte.MAX_VALUE;
    num = (byte)(num + 1);
    System.out.println(num);
    num = Byte.MIN_VALUE;
    num = (byte)(num - 1);
    System.out.println(num);
  }
}
