package com.dream.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dream.domain.Student;
import com.dream.repository.StudentRepository;
import com.dream.service.StudentService;

@Service("studentService")
public class StudentServiceImpl  implements StudentService{

	@Autowired
 	private StudentRepository studentRepository;//注入StudentRepository

	@Override
	@Transactional
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	@Transactional(readOnly=true)
	public Student findStudentById(Integer id) {
		  return studentRepository.findOne(id);
	}

	
	@Override
	@Transactional
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	@Transactional
	public void deleteStudentById(Integer id) {
		studentRepository.delete(id);
	}
	
	
	 /**
	 * @param page
	 * @param size
	 * @return
	 */
	public  Page<Student> findStudentPage(int page, int size)
	{
		PageRequest pageRequest = new PageRequest(page, size);
	    Page<Student> resPage =studentRepository.findAll(pageRequest);
	    return resPage;
	}
	

}
