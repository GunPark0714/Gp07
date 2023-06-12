package day9.classEx;

import java.util.Scanner;
public class StudentScoreManager {

	public static void main(String[]args){
	
   // KorScore 를 인스턴스, 
	

      Scanner sc = new Scanner(System.in);
      sc.close();
      Score1 korScore = new Score1();
      korScore.title = "korean Language";
      korScore.grade = 1;
      korScore.semester = 2;
      Score1 engScore = new Score1(1,2,"English");
      System.out.println(engScore.title);
      
	} 

}
//성적 클라스
class Score1{
	
	    String title; //과목명
    	int grade; //학년
		int semester; //학기
        double total; //총점수
        double midTerm; //중간고사
        double finalTerm; //기말
        double performance; //수행평가
        //score1 클래스의 기본 생성자
	    public Score1() {
	    	/* title의 기본값은? null
	    	 * grade의 기본값은? 0
	    	 * total의 기본값은? 0.0
	    	 */
	    	title = "";
	    	grade = 1;
	    	semester = 1;
	    	
	    }
	    public Score1(int _grade, int _semester, String _title) {
	    	grade = _grade;
	    	semester = _semester;
	    	title = _title;
	    	
	    }
		public final String getTitle() {
			return title;
		}
		public final void setTitle(String title) {
			this.title = title;
		}
		public final int getGrade() {
			return grade;
		}
		public final void setGrade(int grade) {
			this.grade = grade;
		}
		public final int getSemester() {
			return semester;
		}
		public final void setSemester(int semester) {
			this.semester = semester;
		}
		public final double getTotal() {
			return total;
		}
		public final void setTotal(double total) {
			this.total = total;
		}
		public final double getMidTerm() {
			return midTerm;
		}
		public final void setMidTerm(double midTerm) {
			this.midTerm = midTerm;
		}
		public final double getFinalTerm() {
			return finalTerm;
		}
		public final void setFinalTerm(double finalTerm) {
			this.finalTerm = finalTerm;
		}
		public final double getPerformance() {
			return performance;
		}
		public final void setPerformance(double performance) {
			this.performance = performance;
		}
		public Score1(String title, int grade, int semester, double total, double midTerm, double finalTerm,
				double performance) {
			
			this.title = title;
			this.grade = grade;
			this.semester = semester;
			this.total = total;
			this.midTerm = midTerm;
			this.finalTerm = finalTerm;
			this.performance = performance;
		}
	    
}

class Student1{
		String studentname;
		String residentNumber;
	    int grade; //학년
        int classNum;//반
	    int number; //번호  
	    int admissionYear;//입학년도
		Score1 korScore, engScore, mathScore; 		//국어, 영어, 수학 성적
}
