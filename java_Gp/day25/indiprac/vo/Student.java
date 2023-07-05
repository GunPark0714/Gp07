package day25.indiprac.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student implements Serializable{

		
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -5175045027848834449L;
			private String name;
			private String major;
			private String num;
		
	}
