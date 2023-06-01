package day3.operator;

public class ComparisonEx {

	public static void main(String[] args) {
		
		System.out.println("1 > 2 : " + (1 > 2));
		System.out.println("1 < 2 : " + (1 < 2));
		System.out.println("1 >= 2 : " + (1 >= 2));
		System.out.println("1 <= 2 : " + (1 <= 2));
		System.out.println("1 == 2 : " + (1 == 2));
		System.out.println("1 != 2 : " + (1 != 2));
	
		String Str1 = "abc";
		String Str2 = "abc";
		String Str3 = new String("abc");
		System.out.println("Str1 == Str2 : " + (Str1 == Str2));
		System.out.println("Str1 == Str3 : " + (Str1 == Str3));
		System.out.println("Str2 == Str3 : " + (Str2 == Str3));
	    System.out.println("Str1.equals(Str2) : " + Str1.equals(Str2));
	    System.out.println("Str1.equals(Str3) : " + Str1.equals(Str3));
	    System.out.println("Str2.equals(Str3) : " + Str2.equals(Str3));


	    
   	
	}

}
