package com.dream.thread;

public class TestRunnable implements Runnable {

	@Override
	public void run() {
		for (int count=1,row=1;row<10;row++,count++)
		{
			for (int i=0;i<count;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String []args)
	{
		TestRunnable runnable = new TestRunnable();
		Thread t = new Thread(runnable);
		t.start();
	}

}
