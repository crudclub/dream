package com.dream.service;

import org.springframework.data.domain.Page;

import com.dream.domain.Student;

/**
 * 
 * 学生信息的业务组件
 * @date 2014-12-04
 * @author dsy
 *
 */
public interface StudentService {

	/**
     * 保存学生信息
     * @param student
     */
    void saveStudent(Student student);
    
    /**
     * 根据id查找学生信息
     * @param id
     * @return
     */
    Student findStudentById(Integer id);
    
    /**
     * 更新学生信息
     * @param student
     */
    void updateStudent(Student student);
    
    /**
     * 根据ID删除学生信息
     * @param id
     */
    void deleteStudentById(Integer id);
    
    /**
     * @param page
     * @param size
     * @return
     */
    Page<Student> findStudentPage(int page, int size);
	
	
}
