package com.dream;

/**
 * 
 * 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，
 * 这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，
 * JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，
 * 这样我们就不用担心上面的问题。同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题
 * 
 * @author DSY
 * @date 20150511
 * 
 */
public class NewSingleton {
	/* 私有构造方法，防止被实例化 */  
    private NewSingleton() {  
    }  
  
    /* 此处使用一个内部类来维护单例 */  
    private static class SingletonFactory {  
        private static NewSingleton instance = new NewSingleton();  
    }  
  
    /* 获取实例 */  
    public static NewSingleton getInstance() {  
        return SingletonFactory.instance;  
    }  
  
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return getInstance();  
    }  
}
