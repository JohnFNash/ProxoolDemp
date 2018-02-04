package com.johnfnash.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.johnfnash.study.model.Student;
import com.johnfnash.study.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	@ResponseBody
	public List<Student> getStudentList() {
        List<Student> students = studentService.getStudentList();  
        return students;  		
	}
	
	@RequestMapping(value = "/stu/{id}", method = RequestMethod.GET)
	public ResponseEntity<Student> queryStudentById(@PathVariable long id) {
		Student student = studentService.queryStudentById(id);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)  
    public ResponseEntity<Long> deleteStudent(@PathVariable("id") long id) {  
        long showId = studentService.deleteStudent(id);  
        return new ResponseEntity<Long>(showId,HttpStatus.OK);  
    }  
      
    @RequestMapping(value = "/students/{id}", method = RequestMethod.POST)  
    public ResponseEntity<Student> addStudent(@PathVariable("id") long id) {  
        Student student = new Student(id,"rex", "male");  
        student = studentService.addStudent(student);  
        return new ResponseEntity<Student>(student,HttpStatus.OK);  
    } 
    
    @RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)  
    public ResponseEntity<Student> updateStudent(@PathVariable("id") long id) {  
        Student student = new Student(id,"leona", "female");  
        student = studentService.updateStudent(student);  
        return new ResponseEntity<Student>(student,HttpStatus.OK);  
    }  
	
}
