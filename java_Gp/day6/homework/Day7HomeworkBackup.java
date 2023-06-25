package day6.homework;

public class Day7HomeworkBackup {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for (int j = 0; j<5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <(2*1)-i; k++) {
				System.out.print("*");
			}System.out.println();
		}
		for (int i = 4; 1 > 0; i++) {
			for(int j = 0; j<5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <(2*i)-1; k++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
