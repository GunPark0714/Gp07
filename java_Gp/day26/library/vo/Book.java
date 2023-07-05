package day26.library.vo;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;
@Data
public class Book implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1752089776954624860L;
	private String subject;
	private String author;
	private String num;
	private String isbn;
	
    private boolean loan;//대출 여부

	public Book(String subject, String author, String num, String isbn) {
		this.subject = subject;
		this.author = author;
		this.num = num;
		this.isbn = isbn;
	}
	public void loanBook () {
		this.loan = true; //setLoan(true);
	}
	public void returnBook() {
		this.loan = false;//setLoan(false);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(num, other.num);
	}
	@Override
	public int hashCode() {
		return Objects.hash(num);
	}
	
	}

