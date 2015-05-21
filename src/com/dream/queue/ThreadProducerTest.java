package com.dream.queue;

/**
 * 生产者消费者测试
 * @author DSY
 * @date 20150520
 * 
 *
 */
public class ThreadProducerTest {

	public static void main(String[] args)
	{
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();
	}
	
}
