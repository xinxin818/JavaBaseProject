package com.atguigu.designpattern.adapter.interfaceadapter;

/*一些书籍称为：适配器模式或缺省适配器模式。
核心思路：当不需要全部是实现接口提供的方法时，可先设计一个抽象类实现接口，
并为该接口中每一个方法提供一个默认实现（空方法），那么该抽象类的子类可有选择的覆盖父类的某些方法来实现需求。
适用于一个接口不想使用其所有的方法的情况。*/

//在AbsAdapter 我们将 Interface4 的方法进行默认实现
public abstract class AbsAdapter implements Interface4 {

	//默认实现
	public void m1() {

	}

	public void m2() {

	}

	public void m3() {

	}

	public void m4() {

	}
}

