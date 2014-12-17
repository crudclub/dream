package com.dream.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dream.domain.Student;
import com.dream.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext.xml"}) 
public class StudentCrudTest {
	
	@Autowired
    private StudentService studentService;
    
    //保存用户
    @Test
    public void testSaveStudent() {
        Student student = new Student();
        student.setAge("12");
        student.setAddress("test");
        student.setPhone("137");
        student.setName("兜兜");
        studentService.saveStudent(student);
    }
    
    @Test
    public void testStudentPage(){
    	int page = 0;
    	int pageSize = 2;
    	Page<Student> resPage = studentService.findStudentPage(page,pageSize);
        List<Student> studentList =	resPage.getContent();
        
        for(Student student:studentList)
        {
        	System.out.println(student.getName());
        }
       System.out.println("totalElements is :"+resPage.getTotalElements()); 
    }
    
    //根据id查找用户
    @Test
    public void testFindStudentById() {
        Integer id = 1;
        Student student = studentService.findStudentById(id);
        Assert.assertEquals("兜兜",student.getName());
    }
    
    //更新用户
    @Test
    public void testUpdateStudent() {
        Integer id = 1;
        Student student = studentService.findStudentById(id);
        student.setName("test12");
        
        studentService.updateStudent(student);
        
    }
    
    //根据id删除用户
    @Test
    public void testDeleteStudentById() {
        Integer id = 1;
        studentService.deleteStudentById(id);
    }
}
