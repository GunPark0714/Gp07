package day22.practice2.vo;

import lombok.Data;

@Data
public class NumberList {

			int num;
			String name;
		public void NumberList(int num, String name) {
			this.name = name;
			this.num = num;
		}
		
	
	}
