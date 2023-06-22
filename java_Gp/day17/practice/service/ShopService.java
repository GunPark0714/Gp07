package day17.practice.service;

import day15.practice.shop.vo.Product;

public interface ShopService {

	//제품의 수량을 추가하는 기능(없는 제품이면 제품 추가)
	int store(Product[] list, int count, Product product);

}
