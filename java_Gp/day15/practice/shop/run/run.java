package day15.practice.shop.run;

import day15.practice.shop.controller.ShopManager;
public class run {

	public static void main(String[] args) {
		//ShopManager 를 이용해서 제품을 관리하는 프로그램을 실행
		/*1.제품 등록
		 *2.고객 등록 
		 *3.고객 정보 조회 
		 *4.상품 등록
		 *5.상품 조회 
		 *6.종료 
		 */
		
		ShopManager shopManager = new ShopManager();
		shopManager.run();
	}

}
