package com.dream.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dream.domain.Student;

/**
 * @author dsy 20141126
 *
 */

public class StudentTest {

	@Test
	public void testStudent()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = context.getBean("student",Student.class);
		student.setAddress("1111");
		System.out.println("ddd"+student.getAddress());
	}
	
}
