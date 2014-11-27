package com.dream.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.dream.component.AddComponent;
import com.dream.component.impl.AddComponentImpl;
import com.dream.handler.AddHandler;

public class AddProxyTest {

	@Test
	public void addProxyTest()
	{
		AddComponent calc = new AddComponentImpl();
        
        // 类加载器
        ClassLoader loader = AddProxyTest.class.getClassLoader();
        // 需要代理的接口
        Class[] interfaces = {AddComponent.class};
        // 方法调用处理器，保存实际的AdderImpl的引用
        InvocationHandler h = new AddHandler(calc);
        // 为calc加上代理
        calc = (AddComponent) Proxy.newProxyInstance(loader, interfaces, h);
         
        /* 什么？你说还有别的需求？ */
        // 另一个处理器，保存前处理器的引用
        // InvocationHandler h2 = new XXOOHandler(h);
        // 再加代理
        // calc = (AddComponent) Proxy.newProxyInstance(loader, interfaces, h2);
         
        int result = calc.substrut(4, 2);
        System.out.println("The result is " + result);
	}
	
	
}
