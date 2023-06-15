package day12.practice;

public class VocabularyNoteEx2 {
    /*단어장 클래스
     * -단어들의 모임
     * -Word들의 모임
     */
	public static void main(String[] args) {
	}//멤버변수
	
	 // 단어들 
	public class VocabularyNote{
		private String title;
		private String meaning[];
		
		private word wordList[]; //단어들 
		private int wordCount; //저장된 단어의 개수
	    
	//생성자
	public VocabularyNote() {
		wordList = new word[10];
	}
	
	public VocabularyNote(word wordList[]) {
		//기존 단어장의 크기와 10을 비교해서 큰수로 단어장 크기로 선택
		int size = wordList.length > 10 ? wordList.length : 10;
		
		this.wordList = new word[10];
		
		for(int i = 0; i < wordList.length; i++) {
				this.wordList[i] = wordList[i] = new word(wordList[i]);
		}
		wordCount = wordList.length;
		}
	//메서드
	/**단어들을 출력하는 메서드
	 * 매개변수 :  
	 * 리턴타입 :
	 * 메서드명 :
	 */
						
}
}
