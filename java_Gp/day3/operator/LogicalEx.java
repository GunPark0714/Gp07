package day3.operator;

public class LogicalEx {

	public static void main(String[] args) {
		int score = 75;
		//성적이(score) 80점 이상이고, 성적이 90점 미만인가?
		//score가 80보다 크거나 같고, score가 90보다 작다
		//score가 80보다 크거나 같다 && score가 90보다 작다
		//score >= 80 && score < 90
		System.out.println(score + "점은 B학점인가? " + (score >= 80 && score < 90));
		
		int age = 21;
		//20세 이상이면 성인
		
		boolean isadult = age >= 20;
		//age살은 미성년자인가?
		System.out.println(age + "살은 미성년자인가? " + !isadult);
		
		//주민등록증은 있고, 운전면허증이 없음
		boolean hasIdcard = true;
		boolean hasDriverLicense = false;
		//토익을 볼 수 있을까요?(주민등록증이 있거나 운전면허증이 있으면 볼 수 있음)
		System.out.println(" Can I take toeic exam? " + (hasIdcard || hasDriverLicense));
		
	}

}
