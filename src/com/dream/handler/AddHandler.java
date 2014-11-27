package com.dream.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用来学习java 动态代理
 * @author dsy
 *
 */
public class AddHandler implements InvocationHandler  {
	
	 // 被代理的对象
    private Object target;
    
    
    public AddHandler(Object target)
    {
    	this.target = target;
    }
	
	
	/**
     * @param proxy 接下来Proxy要为你生成的代理类的实例，注意，并不是我们new出来的AddComponeentImpl
     * @param method 调用的方法的Method实例。如果调用了add()，那么就是add()的Method实例
     * @param args 调用方法时传入的参数。如果调用了add()，那么就是传入add()的参数
     * @return 使用代理后将作为调用方法后的返回值。如果调用了add()，那么就是调用add()后的返回值
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("调用方法前....");
		// 调用被代理对象的方法并得到返回值
        Object returnValue = method.invoke(target, args);
        System.out.println("得到的返回值为:"+returnValue);
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String nowStr = format.format(date);
        
        // 调用方法前后都可以加入一些其他的逻辑
        System.out.println("proxy 调用方法后 " + method.getName() + "() at " + nowStr);
        // 可以返回任何想要返回的值
        return returnValue;
	}
	
	

}
