package day17.practice.service;

import day15.practice.shop.vo.Product;

public class ShopServiceimp implements ShopService {

	@Override
	public int store(Product[] list, int count, Product product) {
		//입고할 제품이 없으면 입고하지 않고, 기존 제품 수를 알림.
		if(product == null) {
			return count;
		}
		//제품 리스트가 없으면 
		if(list == null) {
			return 0;
		}
		//제품 리스트의 크기가 count보다 작으면 
		if(list.length < count) {
			return list.length;
		}
		//제품 수가 잘못되면
		if(count < 0) {
			return 0;
		}
		
		int index = indexOf(list, count, product);
		//기존 제품 입고
		if(index != -1) {
			list[index].store(product.getAmount());
			return count;
		}
		//배열이 꽉 차면
		if(count == list.length) {
			return count;
		}
		//새 제품 입고
		list[count] = new Product(product);
		return count+1;
	}

	private int indexOf(Product[] list, int count, Product product) {
		//제품 정보가 없거나 제품 명이 없으면 못찾음
		if(product == null || product.getName() == null) {
			return -1;
		}
		//제품 리스트가 없으면
		if(list == null) {
			return -1;
		}
		//검색할 제품수가 잘못 입력되면
		if(count > list.length || count < 0) {
			count = list.length;
		}
		for(int i = 0; i < count ; i++) {
			Product tmp = list[i];
			//제품 리스트에 있는 제품이 없거나 이름이 없거나 찾을 제품명이 없으면 못찾음
			if( tmp == null || 
			    tmp.getName() == null ||
			    product.getName() == null) {
				return -1;
			}
			//제품명끼리 비교하여 같으면 번지를 반환
			if(tmp.getName().equals(product.getName())) {
				return i;
			}
		}
		return -1;
	}
	


	

}
