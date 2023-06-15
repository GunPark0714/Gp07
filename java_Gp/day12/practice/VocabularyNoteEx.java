package day12.practice;

public class VocabularyNoteEx {

	public static void main(String[] args) {
		//영어 단어장을 만들기 위해 필요한 클래스를 만들고 테스트해보세요.
		word word1 = new word("vocabulary", " the words that make up a language");
		word1.print();
		word1.addMeaning("all of the words known and used by a person");
		word1.print();
		word1.removeMeaning(1);
		word1.print();
	}
		

}

/* 한 단어를 관리하는 클래스
 * - 단어
 * - 뜻
 */
class word {
	private String title;
	private String meaning[];
	private int meaningCount;
	
	public word() {}

	public word(String title, String meaning) {
		this.title = title;
		this.meaning = new String[5];//기본 5개
		this.meaning[0] = meaning;
		meaningCount++;
	}
	public word(String title) {
		this.title = title;
		this.meaning = new String[5];//기본 5개
	
	}
	//메서드
	/** 단어와 뜻을 출력하는 메서드
	 *	매개변수 : 없음 
	 *  리턴타입 : 없음 => void
	 *  메서드명 : print
	 */
	public void print() {
		System.out.println("word : " + title);
		System.out.println("meaning");
		for(int i = 0; i<meaningCount; i++) {
			System.out.println(i + 1 + "." + meaning[i]);	
			}
		}
	
	/** 뜻을 추가하는 메서드  
	 *  매개변수 : 추가될 뜻 => String meaning
	 *  리턴타입 : 없음 => void 
	 *  메서드명 : addMeaning
	 */
	public void addMeaning(String meaning) {
		if(meaningCount == this.meaning.length) {
			System.out.println("It's all filled ");
			return;
		}
		this.meaning[meaningCount] = meaning;
		meaningCount++;
	
	}
	/** 뜻을 제거하는 메서드
	 * 매개변수 : 제거할 뜻의 번호 => int num
	 * 리턴타입 : 없음 => void
	 * 메서드명 : removeMeaning
	 */
	
	public void removeMeaning(int num) {
		if(num > meaningCount || num < 1) {
			System.out.println("I can't work.");
			return;
		}
		//num-1번지부터 하나씩 당겨와서 덮어쓰기함.
		for(int i = num-1; i < meaningCount-1; i++) {
			meaning[i] = meaning[i+1];
		}
		//마지막에 쓸모없는 데이터를 지움
		meaning[meaningCount-1] = null;
		//제거 됐으면 뜻 개수를 하나 줄임
		meaningCount--;
		
	}
}
