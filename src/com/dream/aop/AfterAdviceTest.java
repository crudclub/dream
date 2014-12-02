package com.dream.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAdviceTest {

	@After("execution(* com.dream..*.*(..))")
	public void release()
	{
		System.out.println("模拟方法执行结束之后释放资源");
	}
	
}
