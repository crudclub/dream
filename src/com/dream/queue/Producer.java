package com.dream.queue;


/**
 * @author DSY
 * 
 * 实现生产者线程
 *
 */
public class Producer extends Thread {
	
	Queue q;
	
	Producer(Queue q)
	{
		this.q= q;
	}
	
	public void run()
	{
		for (int i=1;i<3;i++)
		{
			q.put(i);
		}
	}

}
