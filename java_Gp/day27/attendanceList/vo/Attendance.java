package day27.attendanceList.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import lombok.Data;
@Data
public class Attendance implements Serializable{
		//학생 한명이 특정날에 출석 했는지를 알려주는 클래스
	
		private Date date; //출석날짜
		private Student student; //학생정보
		private boolean attendance; //출석여부
		
		
		//출석일, 학생, 출석여부를 이용한 생성자
		public Attendance(Date date, Student student, char state ) {
			this.date = date;
			this.student = student;
			this.attendance = state == 'O'?true:false;
		
		
		}


		@Override
		public String toString() {
			return student.toString() + " : " + (attendance?"O" : "X");
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Attendance other = (Attendance) obj;
			return Objects.equals(date, other.date) && Objects.equals(student, other.student);
		}


		@Override
		public int hashCode() {
			return Objects.hash(date, student);
		}


		public String getDateStr() {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			return format.format(date);
		}
		
}

