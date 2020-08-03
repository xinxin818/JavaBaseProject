package com.atguigu.base.day13.java2;

public class Test {

	public static void main(String[] args) {
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);// 1.0
	}
}
