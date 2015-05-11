package com.dream;

/**
 * 工厂设计模式测试类
 * 
 * @author DSY
 *
 */
public class Test {

	public static void main(String []args)
	{
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("mail");
		sender.send();
	}
	
}
