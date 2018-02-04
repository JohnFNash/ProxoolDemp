package com.johnfnash.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnfnash.study.mapper.StudentMapper;
import com.johnfnash.study.model.Student;
import com.johnfnash.study.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
		
	@Override
	public Student addStudent(Student student) {
		return studentMapper.addStudent(student);
	}

	@Override
	public long deleteStudent(Long id) {
		return studentMapper.deleteStudent(id);
	}

	@Override
	public Student queryStudentById(Long id) {
		return studentMapper.queryStudentById(id);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentMapper.updateStudent(student);
	}

	@Override
	public List<Student> getStudentList() {
		return studentMapper.getStudentList();
	}

}
