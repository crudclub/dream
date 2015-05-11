package com.dream.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestTask {

	public static void main(String [] args)
	{
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	/*	int n = 20;
		
		while (n>0)
		{
			System.out.println("循环执行了一次,n的值为:"+n);
			n--;
		}
		
		
		do {
			
			System.out.println("do while 循环无论条件满足不满足都会执行一次do 循环体...");
		
		} while (n>20);
		*/
		for(int i=1;i<51;i++)
		{
			System.out.print(i+" ");
			if(i%5!=0)
			  continue;
			else
				System.out.println("*****");
		}
		
		
	}
}
