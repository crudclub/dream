package com.dream.queue;

/**
 * 消费者
 * @author DSY
 * @date 20150520 
 * 
 */
public class Consumer  extends Thread{

	Queue q;
	
	Consumer(Queue q)
	{
		this.q = q;
	}
	
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
	
}
