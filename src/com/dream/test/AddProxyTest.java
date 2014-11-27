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
        
        // �������
        ClassLoader loader = AddProxyTest.class.getClassLoader();
        // ��Ҫ����Ľӿ�
        Class[] interfaces = {AddComponent.class};
        // �������ô�����������ʵ�ʵ�AdderImpl������
        InvocationHandler h = new AddHandler(calc);
        // Ϊcalc���ϴ���
        calc = (AddComponent) Proxy.newProxyInstance(loader, interfaces, h);
         
        /* ʲô����˵���б������ */
        // ��һ��������������ǰ������������
        // InvocationHandler h2 = new XXOOHandler(h);
        // �ټӴ���
        // calc = (AddComponent) Proxy.newProxyInstance(loader, interfaces, h2);
         
        int result = calc.substrut(4, 2);
        System.out.println("The result is " + result);
	}
	
	
}
