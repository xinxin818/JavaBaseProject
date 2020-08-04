package com.atguigu.designpattern.builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonHouse commonHouse = new CommonHouse();
		commonHouse.build();
		System.out.println("=======================");
		AbstractHouse abstractHouse = new CommonHouse();
		abstractHouse.build();
	}

}
