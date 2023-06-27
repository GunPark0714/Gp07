package day20.homework.vo;

import lombok.Data;

@Data
public class Word {

		private String title;
		private String meaning[];
		private int meaningCount;
		public Word(String title, String meaning) {
			this.title = title;
			this.meaning = new String[5]; //기본 5개
			this.meaning[0] = meaning;
			meaningCount++;
		}
		public Word(String title) {
			this.title = title;
			this.meaning = new String[5]; //기본 5개
		}
		public Word(Word w) {
			this.title = w.title;
			this.meaning = new String[5]; //기본 5개
			for(int i = 0; i<w.meaningCount; i++) {
				this.meaning[i] = w.meaning[i];
			}
			meaningCount = w.meaningCount;
		}
		public void print() {
			System.out.println("word : " + title);
			System.out.println("meaning : ");
			for(int i = 0; i<meaningCount; i++) {
				System.out.println(i+1+". " + meaning[i]);
			}
		}
		public void addMeaning(String meaning) {
			if(meaningCount == this.meaning.length) {
				System.out.println("It's all filled.");
				return;
			}
			this.meaning[meaningCount] = meaning;
			meaningCount++;
		}
		public boolean removeMeaning(int num) {
			if(num > meaningCount || num < 1) {
				return false;
			}
			for(int i = num-1; i < meaningCount-1; i++) {
				meaning[i] = meaning[i+1];
			}
			meaning[meaningCount-1] = null;
			meaningCount--;
			return true;
		}
		public boolean updateMeaning(int meaningNum, String meaning) {
			if(meaningNum > meaningCount || meaningNum <= 0) {
				return false;
			}
			this.meaning[meaningNum-1] = meaning;
			return true;
		}
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		


	}

