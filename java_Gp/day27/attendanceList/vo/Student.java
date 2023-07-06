package day27.attendanceList.vo;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

@Data
public class Student implements Serializable{
	
	
	private static final long serialVersionUID = -1750508790116593980L;
			//학생 클래스
			private String name; 
			private String num;
			
			
			
			public Student(String name, String num) {
				this.name = name;
				this.num = num;
	}


			public Student(Student tmp) {
				this(tmp.num, tmp.name);
			}
			//복사생성자 구현
			//학번으로만 개체가 같은지 판별
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Student other = (Student) obj;
				return Objects.equals(num, other.num);
			}



			@Override
			public int hashCode() {
				return Objects.hash(num);
			}


			@Override
			public String toString() {
				return num + " " + name;
			}
			
			
			
}
