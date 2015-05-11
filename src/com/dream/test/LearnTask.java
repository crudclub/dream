package com.dream.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class LearnTask {

	public static void main(String [] args)
	{
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
				SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
				Date date = new Date();
				
				System.out.println("Timer task is run...");
				System.out.println("当前时间为:"+format.format(date));
				System.out.println("当前时间为:"+format1.format(date));
			}
		};
		
		Timer timer = new Timer();
		timer.schedule(task,0,5*1000);
	}
	
}
