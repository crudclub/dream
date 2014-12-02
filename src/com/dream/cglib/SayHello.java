package com.dream.cglib;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Component;

/**
 * 用来学习 CGlib 动态代理
 * @author dsy
 *
 */
@Component("sayHello")
public class SayHello {
	public void say(){
		  System.out.println("hello everyone");
		   try {
			new java.io.FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			  System.out.println("目标类的异常处理:"+e.getMessage());
		    }
		 }
	
	
	public void divide()
	{
		int a = 5/0;
		System.out.println("divide is finished");
	}
}
