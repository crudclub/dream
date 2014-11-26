package com.dream.test;

import org.apache.log4j.Logger;

public class First {

	private static Logger logger =  Logger.getLogger(First.class);
	
	public static void main(String [] args)
	{
		logger.info("It is my dream!");
		System.out.println("My dream will do first!");
		add();
	}
	
	private static  void add()
	{
		int i = 1;
		int j = 3;
		int k = i+j;
		System.out.println("1+3的和为:"+k);
	}
	
}
