package day20.homework.vo;

public class VocabularyNote {
/* 13일차 과제인 영어 단어장 코드를 리스트와 에외처리를 이용하여 수정하세요.
 * 
 */
	//멤버 변수
		//단어들
		private Word wordList[];//단어들
		private int wordCount;//저장된 단어의 개수
		
		//생성자
		public VocabularyNote() {
			wordList = new Word[10];
		}
		
		public VocabularyNote(Word wordList[]) {
			int size = wordList.length > 10 ? wordList.length : 10;
			
			this.wordList = new Word[size];
			
			for(int i = 0; i < wordList.length; i++) {
				this.wordList[i] = new Word(wordList[i]);
			}
			wordCount = wordList.length;
		}
		public void print() {
			System.out.println("======================");
			for(int i = 0; i<wordCount; i++) {
				wordList[i].print();
				System.out.println("======================");
			}
		}
		public void insert(Word word) {
			if(wordCount == wordList.length) {
				System.out.println("Vocabulary note is full!");
				return;
			}
			wordList[wordCount++] = new Word(word);
		}
		
		public int insert(String title, String meaning) {
			if(wordCount == wordList.length) {
				//System.out.println("Vocabulary note is full!");
				return 0;
			}
			int index = indexOf(title);
			if(index == -1) {
				wordList[wordCount++] = new Word(title, meaning);
				return 1;
			}
			wordList[index].addMeaning(meaning);
			return -1;
		}
		public boolean delete(String title) {
			int index = indexOf(title);
			if(index == -1) {
				return false;
			}
			for(int i = index; i < wordCount-1; i++) {
				wordList[i] = wordList[i+1];
			}
			wordCount--;
			wordList[wordCount] = null;
			return true;
		}		
		public int indexOf(String title) {
			for(int i = 0; i<wordCount; i++) {
				if(wordList[i].getTitle().equals(title)) {
					return i;
				}
			}
			return -1;
		}
		
		public boolean search(String title) {
			int index = indexOf(title);
			
			if(index == -1) {
				System.out.println("No words found");
				return false;
			}
			
			wordList[index].print();
			return true;
		}
		
		public boolean updateMeaning(String title, int meaningIndex, String meaning) {

			int index = indexOf(title);
			
			if(index == -1) {
				System.out.println("No words found");
				return false; 
			}
			
			if(!wordList[index].updateMeaning(meaningIndex, meaning)) {
				//System.out.println("Wrong number");
				return false;
			}
			return true;
		}
		
		public boolean updateTitle(String title, String updateTitle) {
			int index = indexOf(title);
			
			if(index == -1) {
				//System.out.println("No words found");
				return false; 
			}
			
			wordList[index].setTitle(updateTitle);
			return true;
		}

		public boolean deleteMeaning(String title, int num) {
			int index = indexOf(title);
			if(index == -1) {
				return false;
			}
			Word tmp = wordList[index];
			if(tmp.removeMeaning(num)) {
				return true;
			}
			return false;
		}
	}









