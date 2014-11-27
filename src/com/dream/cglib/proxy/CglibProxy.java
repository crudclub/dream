package com.dream.cglib.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * JDK实现动态代理需要实现类通过接口定义业务方法，对于没有接口的类，如何实现动态代理呢，这就需要CGLib了。
 * CGLib采用了非常底层的字节码技术，其原理是通过字节码技术为一个类创建子类，并在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑。
 * JDK动态代理与CGLib动态代理均是实现Spring AOP的基础。
 * 
 * @author dsy
 *
 */
public class CglibProxy  implements MethodInterceptor{

	
	private Enhancer enhancer = new Enhancer();
	 public Object getProxy(Class clazz){
	  //设置需要创建子类的类
	  enhancer.setSuperclass(clazz);
	  enhancer.setCallback(this);
	  //通过字节码技术动态创建子类实例
	  return enhancer.create();
	 }
	 
	 
	 
	 
	 //实现MethodInterceptor接口方法
	 public Object intercept(Object obj, Method method, Object[] args,
	   MethodProxy proxy) throws Throwable {
	  System.out.println("前置代理");
	  //通过代理类调用父类中的方法
	  Object result = proxy.invokeSuper(obj, args);
	  System.out.println("后置代理");
	  return result;
	 }

}
