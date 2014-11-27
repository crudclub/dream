package com.dream.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dream.component.AddComponent;

public class SpringAopTest {

	@Test
	public void AddTest()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddComponent addComponent = (AddComponent) ctx.getBean("addComponent");
		int k = addComponent.add(4, 5);
	}
	
	
}
