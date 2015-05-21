package com.dream.queue;

public class Queue {

	int value = 0;
	boolean isEmpty = true;
	
	public synchronized void put (int v)
	{
		//如果共享数据没有被消费，则生产者等待
		if(!isEmpty)
		{
			try
			{
				System.out.println("生产者等待");
				wait();//进入等待状态
		    }catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		value+=v; //value 值加v
		isEmpty = false;// isEmpty 赋值为false
		System.out.println("生产者共生产数量:"+v);
		notify();//生产之后通知消费者
	}
	
	
	public synchronized int get()
	{
		if(isEmpty)
		{
			try
			{
				System.out.println("消费者等待");
				wait();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		value--;
		if(value<1)
		{
			isEmpty = true;
		}
		System.out.println("消费者消费一个，剩余:"+value);
		notify();//消费后通知生产者生产
		return value;
	}
	
}
