package com.atguigu.designpattern.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Decorator extends Drink {
	private Drink obj;
	
	public Decorator(Drink obj) { //组合
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		// getPrice 自己价格
		return super.getPrice() + obj.cost();
	}
	
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		// obj.getDes() 输出被装饰者的信息
		return des + " " + getPrice() + " && " + obj.getDes();
	}
	
	/**
	 * 说明：
	 * 1. InputStream 是抽象类，类似于我们前面讲的Drink
	 * 2. FileInputStream 是 InputStream子类，类似我们前面的 Decaf，LongBlack
	 * 3. FilterInputStream 是InputStream 子类：类似我们前面的 Decorator修饰者
	 * 4. DataInputStream 是FilterInputStream 子类，具体的修饰者，类似前面的Milk，Soy等
	 * 5. FilterInputStream 类有protected volatile InputStream in；即含被装饰者
	 * 6.   分析得出在jdk 的 io体系中，就是使用装饰者模式。
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
			DataInputStream dis = new DataInputStream(new FileInputStream("D:\\file\\doc\\ecif\\0.项目前期参考文档\\ECIF、核心开发环境数据库.txt"));
			
			System.out.println(dis.read());
			dis.close();
	}
	

}
