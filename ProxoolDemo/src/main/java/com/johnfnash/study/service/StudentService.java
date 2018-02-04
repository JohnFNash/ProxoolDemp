package com.johnfnash.study.service;

import java.util.List;

import com.johnfnash.study.model.Student;

public interface StudentService {
	public Student addStudent(Student student);

	public long deleteStudent(Long id);

	public Student queryStudentById(Long id);

	public Student updateStudent(Student student);

	public List<Student> getStudentList();
}
