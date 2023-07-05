package day26.library.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day26.library.vo.Book;
import day26.library.vo.BookRental;
import day26.library.vo.LoanBrowsing;

public class BookManager implements Program{

		
		Scanner sc = new Scanner(System.in);
		private final static int EXIT = 4;
		private final static int RENTAL_EXIT = 6;
		List <Book> list = new ArrayList<>();
		List <BookRental> list2 = new ArrayList<>();
	@Override
	public void printmenu() {
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 대출");
		System.out.println("3. 도서 목록 조회");
		System.out.println("4. 종료 ");
		
		
	}	
				
	@Override
	public void run() {
		int menu;
		do {
			System.out.println("==========");
			printmenu();
			menu = sc.nextInt();
			runmenu(menu);
			System.out.println("==========");
		}while(menu != EXIT);
	}
	@Override
	public void runmenu(int menu) {
		switch(menu) {
		case 1 : 
			 	InsertBook();
				break;
		case 2 :
				runsub();
				break;
		case 3 : 
				printBooklist();
				break;
		case 4 :
				break;
		default : System.out.println("Wrong input");
			
		
		}
			
	}

	private void submenu() {
		System.out.println(" 도서 대출 ");
		System.out.println("1  대출 정보 조회");
		System.out.println("2. 대출 정보 등록");
		System.out.println("3. 대출");
		System.out.println("4. 반납");
		System.out.println("5. 모든 대출 정보 조회");
		System.out.println("6. 종료");
		
		
	}

	private void printBooklist() {
		for(Book tmp2 : list) {
			System.out.println(tmp2);
		}
	}

	private void InsertBook() {
		System.out.println("도서 등록");
		System.out.println("등록할 책 이름 : ");
		sc.nextLine();
		String subject = sc.nextLine();
		System.out.println("등록할 책 저자 : ");
		String author = sc.nextLine();
		System.out.println("등록할 책 도서번호 : ");
		String num = sc.nextLine();
		System.out.println("등록할 책 isbn번호 : ");
		String isbn = sc.nextLine();
		
		Book tmp = new Book(subject, author, num, isbn);
		if(!list.contains(tmp)) {
			list.add(tmp);
		   System.out.println("도서 등록 완료!");
		}
		else System.out.println("도서 등록 실패!");
		}


	@Override
	public void runsub() {
		int menu2;
		do {
			System.out.println("=================");
		    submenu();
		    menu2 = sc.nextInt();
		    runsubmenu(menu2);
		    System.out.println("=================");
		}while(menu2 != RENTAL_EXIT);
	}

	@Override
	public void runsubmenu(int menu2) {
		switch(menu2) {
		case 1 : 
				printBookRentalinfo();
				break;
		case 2 :
				InsertRentalinfo();
				break;
		case 3 :
				bookrental();
				break;
		case 4 :
				bookreturn();
				break;
		case 5 : 
				printAllBookRentalinfo();
				break;
		case 6 :
				break;
		default : System.out.println("Wrong input");
		}
	}

	private void printAllBookRentalinfo() {
		for(BookRental tmp : list2) {
			System.out.println(tmp);
		}
		
	}

	private void InsertRentalinfo() {
		System.out.println("도서 대출 정보 입력");
		System.out.println("대출정보를 입력할 책 도서번호 : ");
		sc.nextLine();
		String num = sc.nextLine();
		System.out.println("도서 대출일 : ");
		String dayofrent = sc.nextLine();
		System.out.println("도서 반납예정일 : ");
		String returnSchedule = sc.nextLine();
		System.out.println("도서 반납일 : ");
		String dayofreturn = sc.nextLine();
		
		BookRental rnt = new BookRental(num, dayofrent, returnSchedule, dayofreturn);
		
		if(!list2.contains(rnt)) {
			list2.add(rnt);
			System.out.println("대출 정보 입력 완료");
		}
		else System.out.println("대출 정보 입력 실패!");
	}

	
	private void printBookRentalinfo() {
		sc.nextLine();//이전에 입력한 엔터 처리
		
		System.out.print("대출정보를 검색할 책 도서번호 : ");
		String num = sc.nextLine();
		
		
		//검색 결과를 출력
		//도서 번호가 올바른지 확인
		//번호에 맞는 도서가 있는지 확인
		
		//도서가 없으면 올바르지 않음
		
		//도서가 있으면 대출중인지 확인
		boolean posssible 
			= bookList
			.stream()
			.filter(b->!b.isLoan&&b.getNum().euqals(num))
			.count() > 0;
			
		//올바르지 않으면(없는 도서번호이거나, 대출중인 도서인 경우)
		
		//대출할 수 없다고 출력
		if(!possible) {
			System.out.println("대출할 수 없습니다. ");
			return;
		}
		//올바르면 대출을 진행 
		//도서 대출 객체 생성. 도서, 대출일, 대출기간 
		int index = bookList.indexof(new Book(num, null, null, null));
		Date loanDate = new Date();
		LoanBrowsing lb = new LoanBrowsing(bookList.get(index), loanDate, 14);
		//대출열람 리스트에 추가
		
		//대출일을 출력
		System.out.println(lb.getLoanDateStr());
		//반납예정일 출력
		
		//
		pb.print(s->s.getnum().contains(num));
			System.out.println("도서 대출 정보 조회 성공 : " + );
		
		
		
}
	   
	private void bookreturn() {
		// TODO Auto-generated method stub
		
	}
	private void bookrental() {
		//대출 가능한 도서들을 조회
		Stream<T> <Book> stream = Book.stream();
		stream.filter(b->!b.isLoan()).foreach(b->{ //대여가 안된 책들
		sys
		}
		//도서 번호를 입력
		//대출을 신청
	}
	
	}
