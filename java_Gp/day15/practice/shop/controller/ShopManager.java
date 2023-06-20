package day15.practice.shop.controller;

import java.util.Scanner;

import day15.practice.shop.vo.Product;
public class ShopManager {
	
	private Scanner sc = new Scanner(System.in);
	private Product list[] = new Product[10];
	private int count = 0; //저장된 제품 개수
	public void run() {
		//반복(종료를 선택하기전까지) => 무조건 1번은 실행
		/*제품 판매 : 어떤 고객이 어떤 제품을 구매했는지 관리
		 *제품 입고 : 새 제품이 추가됨. 어떤 제품이 몇개 추가됐는지 관리
		 *제품 조회 : 제품 정보 조회. 제품명으로 제품을 조회
		 *매출 조회 : 판매된 제품 매출 조회. 누적 매출
		 *고객 등록 : 고객을 추가하여 고객을 관리
		 *프로그램 종료
		 */
		System.out.println("프로그램을 시작합니다.");
		int menu = -1;
		final int EXIT = 6;
		do {
			//메뉴 출력
			printMenu();
			
			//메뉴 선택
			menu = sc.nextInt();
			
			//메뉴에 따른 기능 실행
			runMenu(menu);
			
		} while(menu != EXIT);
		System.out.println("프로그램 종료!!");
		sc.close();
	}
			
			private void printMenu() {
			
			System.out.println("프로그램 가동중입니다");
			
		
	}
			private void runMenu(int menu) {
				
				switch(menu) {
				//메뉴가 1이면 제품 판매 기능을 실행
				case 1:
					System.out.println("================");
					Sell();
					System.out.println("================");
					break;
				//메뉴가 2이면 제품입고 기능을 실행
				case 2:
					System.out.println("================");
					Store();
					System.out.println("================");
					break;
				//메뉴가 3이면 상품조회 기능을 실행
				case 3:
					System.out.println("================");
					PrintProduct();
					System.out.println("================");
					break;
				//메뉴가 4이면 매출 조회 기능을 실행
				case 4:
					System.out.println("================");
					printSales();
					System.out.println("================");
					break;
				//메뉴가 5이면 프로그램을 종료
				case 5:
					System.out.println("================");
					registerCustomer();
					System.out.println("================");
					break;
				case 6:
					System.out.println("================");
					System.out.println("프로그램을 종료합니다.");
					System.out.println("================");
					break;
				//메뉴가 그외이면 잘못된 메뉴라고 출력
				default:
					System.out.println("================");
					System.out.println("잘못된 메뉴 선택!");
					System.out.println("================");
				}
			}
			private void registerCustomer() {
				// TODO Auto-generated method stub
				
			}

			private void printSales() {
				// TODO Auto-generated method stub
				
			}

			private void PrintProduct() {
				// TODO Auto-generated method stub
				
			}

			private void Sell() {
				// TODO Auto-generated method stub
				
			}

			private void Store() {
				//입고할 제품명 입력
				System.out.print("제품명 : ");
				String name = sc.next();
				sc.nextLine();
				//입고할 수량
				System.out.print("수량 : ");
				int amount = sc.nextInt();
				
				if(amount < 0) {
					System.out.println("입고 수량 오류!");
					return;
				}
				//제품리스트에서 입고할 제품명이 있는지 찾음. 
				
				//제품 배열에 있는 제품명과 입고할 제품명이 같은지를 
				//확인해서 같으면 위치를 기억
				int index = indexOf(name);
				//있으면 입고할 제품 수량 만큼 해당 제품에 입고
				//위치가 0이상이면 
				if(index != -1) {
					list[index].store(amount);
					System.out.println("입고 완료!");
					return;
				}
				//없으면 제품 리스트에 제품 정보를 추가(입고할 수량도 함께)
				//위치가 -1이면
				//최대치로 등록되어 있으면
				if(count == list.length) {
					System.out.println("제품 리스트 다참!");
					return;
				}
				//모델명 입력
				System.out.println("새 제품 등록");
				System.out.print("모델명 : ");
				sc.nextLine();
				String modelName = sc.nextLine();
				//가격을 입력
				System.out.println("가격 : ");
				int price = sc.nextInt();
				//분류 입력
				System.out.println("분류 : ");
				String category = sc.next();
				
				//제품 리스트에 추가
				list[count++] = new Product(name, modelName, price, amount, "");
				
				System.out.println("제품 추가 후 입고 완료!");
			}
			/** 제품 리스트에 제품명과 일치하는 제품이 있으면 번지를, 없으면
			 *  -1을 알려주는 메서드
			 *  매개변수 : 제품명 => String name
			 *  리턴타입 : 제품이 있는 번지나 -1 => 정수 => int
			 *  메서드명 :	indexOf 
			 */
			public int indexOf(String name) {
				for(int i = 0; i < count; i++) {
					if(list[i].getName().equals(name)) {
						return i;
					}
				}
				return -1;
				
			}
}
		
			
