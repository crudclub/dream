package com.dream.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * aop 来对访问的组件进行增强,添加了日志处理
 * 
 * @author dsy
 *
 */
@Aspect
@Component
public class LogIntercept {
	@Pointcut("execution(* com.dream..*.*(..))")
    public void recordLog(){}
     
     
    @Before("recordLog()")
    public void before() {
        this.printLog("已经记录下操作日志@Before 方法执行前");
    }
     
    @Around("recordLog()")
    //方法有返回值的话这个地方一定要返回一个Object对象,不然会报空指针错误
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        this.printLog("已经记录下操作日志@Around 方法执行前");
      Object o =   pjp.proceed();
   
     this.printLog("已经记录下操作日志@Around 方法执行后");
     return o;
       
    }
     
     
    //@After 和 @AfterReturning 的区别是   @After 无论目标方法是正常或者异常结束,增加处理都会执行
    //@AfterReturning 目标方法必须是正常结束的时候,增强处理才会执行
    @After("recordLog()")
    public void after() {
        this.printLog("已经记录下操作日志@After 方法执行后");
    }
     
    @AfterReturning(returning="rvt",value="execution(* com.dream..*.*(..))")
    public void afterReturn(Object rvt)
    {
    	System.out.println("获取目标方法的返回值:"+rvt);
    }
    
    
    @AfterThrowing(throwing="ex",pointcut="execution(* com.dream..*.*(..))")
    public void afterThrowEx(Throwable ex)
    {
    	System.out.println("获取到目标方法抛出的异常为:"+ex);
    	System.out.println("模拟抛出异常后的增加处理");
    }
    
    
    private void printLog(String str){
        System.out.println(str);
    }
}
