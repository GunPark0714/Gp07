package day8.homework;

public class IndipracScore {

	public static void main(String[] args) {
		/*성적을 입력받아 학점을 출력하는 코드를 작성하세요.*/
		double score = 90;
		System.out.println(getGrade(score));
}
	public static String getGrade(double score) {
		if(score > 100 || score < 0) {
			System.out.println("wrong Input");
		}
		
		int res = (int)(score/10);
		switch(res) {
		case 10 :
		case 9 : return "A";
		case 8 : return "B";
		case 7 : return "C";
		case 6 : return "D";
		default : return "F";
		
		}
	}
}