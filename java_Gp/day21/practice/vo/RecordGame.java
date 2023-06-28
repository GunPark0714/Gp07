package day21.practice.vo;

import lombok.Data;

@Data
public class RecordGame {
	
	private String id;
	private int count;
	
	public RecordGame(String id, int count) {
		this.id = id;
		this.count = count;
	}
	public void ScoreRank(int count) {
		this.count = count;
	}
	

	@Override
	public String toString() {
		return "[" + id + " : " + count + "]";
		
	}
}

