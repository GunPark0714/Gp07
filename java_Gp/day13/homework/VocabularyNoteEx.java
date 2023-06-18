package day13.homework;

import day12.practice.Word;

public class VocabularyNoteEx {
	/*	Word, VocabularyNote 클래스 이용
	 * 메뉴 
	 * 1. 단어 추가
	 * 2. 단어 삭제
	 * 3. 단어 수정
	 *    a. 단어 수정
	 *    b. 뜻 수정
	 *    c. 뜻 삭제
	 * 4. 단어 출력
	 *    a. 전체 출력
	 *    b. 검색
	 * 5. 프로그램 종료
	 */
		
	/* 예시
	 * 1.단어 추가
	 * 2.단어 삭제
	 * 3.단어 수정
	 * 4.단어 출력
	 * 5.프로그램 종료
	 * 
	 * 메뉴선택 : 3
	 * 
	 * 서브 메뉴
	 * 1.단어 수정
	 * 2. 뜻 수정
	 * 3. 뜻 삭제
	 * 
	 * 서브메뉴선택 : 1
	 * 수정할 단어 : a
	 * 수정할 단어 : A
	 * 수정에 성공했습니다.
	 */



	private Word wordList[];//단어들
	private int wordCount;//저장된 단어의 개수
	
	//생성자
	public VocabularyNoteEx() {
		wordList = new Word[10];
		
	}
		
		public void insert(Word word) {
			//단어장에 단어가 다 찼으면 추가를 하지 못함.
			if(wordCount == wordList.length) {
				System.out.println("Vocabulary note is full!");
				return;
			}
			//깊은 복사를 위해 Word의 복사 생성자를 이용하여 새 단어를 생성한 후 추가
			wordList[wordCount++] = new Word(word);
		}
		public void delete(String title) {
			//단어가 어디있는지 찾아야 함.
			int index = indexOf(title);
			//단어가 단어장에 없으면 알림 메세지 출력후 종료
			if(index == -1) {
				System.out.println("No words found");
				return ;
			}
			//찾은 위치부터 한칸씩 밀어줌.
			for(int i = index; i < wordCount-1; i++) {
				wordList[i] = wordList[i+1];
			}
			//단어의 개수를 하나 줄여줌
			wordCount--;
			//마지막 단어를 비워줌(null)
			wordList[wordCount] = null;
	}

		private int indexOf(String title) {
			// TODO Auto-generated method stub
			return 0;
		}
		public int indexOf1(String title) {
			//단어장에 등록된 단어들을 조회
			for(int i = 0; i<wordCount; i++) {
				//단어가 같으면 i번지를 리턴
				if(wordList[i].getTitle().equals(title)) {
					return i;
				}
			}
			//여기까지 오면 일치하는 단어가 없는 경우이므로 -1을 리턴
			
			
			public void search(String title) {
				int index = indexOf(title);
				
				if(index == -1) {
					System.out.println("No words found");
					return ;
				}
				
				wordList[index].print();
			}

}
}