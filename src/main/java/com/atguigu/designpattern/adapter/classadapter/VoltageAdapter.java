package com.atguigu.designpattern.adapter.classadapter;

/**
  * 类适配器模式注意事项和细节：
  * 
 * 1.java是单继承机制，所以类适配器需要继承src类 这一点算是一个缺点，因为这要求dst必须是接口，有一定局限性；
 * 2.src类的方法在Adapter中都会暴露出来，也增加了使用的成本；
 * 3.由于其继承了src类，所以它可以根据需求重写src类的方法，使得Adapter的灵活性增强了。
 */
 
//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		//获取到220V电压
		int srcV = output220V();
		int dstV = srcV / 44 ; //转成 5v
		return dstV;
	}

}
