package com.dream.thread;

public class ThreadDemo extends Thread {

	ThreadDemo(){}
	
	ThreadDemo(String name)
	{
		super(name);
	}
	
	
	public void run()
	{
		for (int count=1,row=1;row<10;row++,count++)
		{
			for (int i=0;i<count;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String [] args)
	{
		ThreadDemo threadDemo = new ThreadDemo();
		threadDemo.start();
		
		ThreadDemo threadDemo1 = new ThreadDemo();
		threadDemo1.start();
		
		ThreadDemo threadDemo2 = new ThreadDemo();
		threadDemo2.start();
		
	}
	
}

