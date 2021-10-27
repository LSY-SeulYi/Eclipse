package com.vision.strategy;

import java.util.ArrayList;

// 전략패턴에서 사용할 상품의 표준규약
public interface Goods {
	
	public String sale();
	public ArrayList<String> getCustomers();

}
