package day15.practice.shopindi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day15.practice.shopindi.vo.Customer;
import day15.practice.shopindi.vo.Product;
import day17.practice.vo.Sales;

public class ShopManager implements Program{
	/*1.제품 등록
	 *2.고객 등록 
	 *3.고객 정보 조회 
	 *4.상품 등록
	 *5.상품 조회 
	 *6.종료 
	 */
	
	
	
	
	
	
	private final static int EXIT = 6;
	Scanner sc = new Scanner(System.in);
	List <Product> productList = new ArrayList<>();
	ArrayList <Customer> customerList = new ArrayList<>();
	List <Sales> SalesList = new ArrayList<>();
	
	@Override
	public void printmenu() {
		System.out.println("1.상품 등록");
		System.out.println("2.고객 등록");
		System.out.println("3.고객 정보 조회");
		System.out.println("4.매출 조회");
		System.out.println("5.상품 조회");
		System.out.println("6.종료");
	}
	@Override
	public void run() {
		int menu;
		do {System.out.println("=================");
			printmenu();
			menu = sc.nextInt();
			runmenu(menu);
			System.out.println("==================");
		
	}
	@Override
	public void runmenu(int menu) {
		switch(menu) {
		case 1 : 
				inputproduct();
				break;
		case 2 :
				inputcustomer();
				break;
		case 3 :
				printcustomer();
				break;
		case 4 :
				printSales();
				break;
		case 5 :
				printproduct();
				break;
		case 6 : 
			    break;
		default : System.out.println("Wrong input");
		
	}
	
	
	
	
		
	}
	private void printproduct() {
		System.out.println();
	}
		
	private void printSales() {
		// TODO Auto-generated method stub
		
	}
	private void printcustomer() {
		// TODO Auto-generated method stub
		
	}
	private void inputcustomer() {
		// TODO Auto-generated method stub
		
	}
	private static void inputproduct() {
		System.out.println("상품 등록");
		sc.nextLine();
		System.out.println("상품 명 : ");
		String name = sc.nextLine();
		System.out.println("상품코드 : ");
		String num = sc.nextLine();
		System.out.println("가격 : ");
		String price = sc.nextLine();
		
		
	}
}


	
