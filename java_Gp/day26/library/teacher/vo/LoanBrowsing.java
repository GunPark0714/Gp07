package day26.library.teacher.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import lombok.Data;

//대출 열람(도서대출 기록)
@Data
public class LoanBrowsing implements Serializable {

	private static final long serialVersionUID = 4272632230761810647L;

	private Book book;//대출 도서
	private Date loanDate;//대출일
	private Date returnDate;//반납일
	private Date estimatedDate;
	
	public LoanBrowsing(Book book, Date date, int loanPeriod) {
		this.book = book;
		this.loanDate = date;
		caculateReturnDadate(loanPeriod);
	}

	
	
	private void caculateReturnDadate(int loanPeriod) {
		if(loanDate == null) {
			return;
	}
		Long loanDateMs = loanDate.getTime();
		Long periodMs =loanPeriod * 24 * 60 * 60 * 1000L;
		estimatedDate = new Date(loanDateMs + periodMs);

	public String getLoanDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(loanDate);
	}

	public String getReturnDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(returnDate);
	}
	Long loanDateMs = loanDate.getTime();
	Long periodMs = loanPeriod * 24 * 60 * 60 * 1000L;
	
	estimatedDate = new Date(loanDateMs + periodMS);
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanBrowsing other = (LoanBrowsing) obj;
		return Objects.equals(book, other.book);
	}



	@Override
	public int hashCode() {
		return Objects.hash(book);
	}




	
	
}







