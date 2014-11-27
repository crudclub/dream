package com.dream.test;

import org.junit.Test;

import com.dream.cglib.SayHello;
import com.dream.cglib.proxy.CglibProxy;

public class CglibTest {

	@Test
	public void cglibTest()
	{
		  CglibProxy proxy = new CglibProxy();
		  //ͨ����������ķ�ʽ����������
		  SayHello proxyImp = (SayHello)proxy.getProxy(SayHello.class);
		  proxyImp.say();
	}
}
