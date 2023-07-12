package day25.practice.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Student3 implements Serializable{

	private static final long serialVersionUID = -3948131167141278183L;
		private String name;
		 private String num;
		 private String major;
	
	}
