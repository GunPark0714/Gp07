package day15.practice.shopindi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day15.practice.shopindi.vo.Customer;
import day15.practice.shopindi.vo.Product;
import day17.practice.vo.Sales;

public class ShopManager implements Program{

	
	private final static int EXIT = 6;
	Scanner sc = new Scanner(System.in);
	List <Product> productList = new ArrayList<>();
	ArrayList <Customer> customerList = new ArrayList<>();
	List <Sales> SalesList = new ArrayList<>();
	
	@Override
	public void printmenu() {
		System.out.println("메뉴");
		System.out.println("1. 제품 판매");
		System.out.println("2. 제품 입고");
		System.out.println("3. 제품 조회");
		System.out.println("4. 매출 조회");
		System.out.println("5. 고객 등록");
		System.out.println("6. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		
	}
	
	@Override
	public void run() {
		int menu;
		do {
			System.out.println("===============");
			printmenu();
			menu = sc.nextInt();
			runmenu(menu);
			System.out.println("===============");
		}while (menu != 6);
	}

	@Override
	public void runmenu(int menu) {
		switch(menu) {
		case 1 : 
				sellProduct();
				break;
		case 2 : 
				inputProduct();
				break;
		case 3 :
				printProduct();
				break;
		case 4 : 
				printsales();
				break;
		case 5 :
				inputCustomer();
				break;
		case 6 : 
				break;
		default : System.out.println("wrong input");
		}
		
	}
	private void inputCustomer() {
		System.out.println("고객 등록");
		sc.nextLine();
		System.out.println("고객명 : ");
		String name = sc.nextLine();
		System.out.println("멤버쉽 번호 :");
		String membershipnum = sc.nextLine();	
		System.out.println("전화번호 : " );
		String Phonenumber = sc.nextLine();
		
		Customer cus = new Customer(name, membershipnum, Phonenumber);
		if(!customerList.contains(cus)) {
		    customerList.add(cus);
		    System.out.println("고객 등록 성공!");
		}
		else System.out.println("고객 등록 실패!");
	}

	private void printsales() {
		
	}

	private void printProduct() {
		System.err.println("상품 등록");
		sc.nextLine();
		System.out.println("상품명 : ");
		String name = sc.nextLine();
		System.out.println("제조회사 :");
		String company = sc.nextLine();	
		System.out.println("가격 : " );
		String price = sc.nextLine();
		System.out.println("종류 : ");
		String type = sc.nextLine();
		
		Product pro = new Product(name, company, price, type);
		if(!productList.contains(pro)) {
		    productList.add(pro);
		    System.out.println("상품 등록 성공!");
		}
		else System.out.println("상품 등록 실패!");
	}
	

	private void inputProduct() {
		// TODO Auto-generated method stub
		
	}

	private void sellProduct() {
		// TODO Auto-generated method stub
		
	}
}

	
