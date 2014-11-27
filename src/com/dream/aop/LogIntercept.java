package com.dream.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
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
     
     
    @After("recordLog()")
    public void after() {
        this.printLog("已经记录下操作日志@After 方法执行后");
    }
     
     
    private void printLog(String str){
        System.out.println(str);
    }
}
