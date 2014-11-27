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
 * aop ���Է��ʵ����������ǿ,�������־����
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
        this.printLog("�Ѿ���¼�²�����־@Before ����ִ��ǰ");
    }
     
    @Around("recordLog()")
    //�����з���ֵ�Ļ�����ط�һ��Ҫ����һ��Object����,��Ȼ�ᱨ��ָ�����
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        this.printLog("�Ѿ���¼�²�����־@Around ����ִ��ǰ");
      Object o =   pjp.proceed();
   
     this.printLog("�Ѿ���¼�²�����־@Around ����ִ�к�");
     return o;
       
    }
     
     
    @After("recordLog()")
    public void after() {
        this.printLog("�Ѿ���¼�²�����־@After ����ִ�к�");
    }
     
     
    private void printLog(String str){
        System.out.println(str);
    }
}
