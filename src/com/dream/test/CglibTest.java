package com.dream.test;

import org.junit.Test;

import com.dream.cglib.SayHello;
import com.dream.cglib.proxy.CglibProxy;

public class CglibTest {

	@Test
	public void cglibTest()
	{
		  CglibProxy proxy = new CglibProxy();
		  //通过生成子类的方式创建代理类
		  SayHello proxyImp = (SayHello)proxy.getProxy(SayHello.class);
		  proxyImp.say();
	}
}
