package com.swaggerimplement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swaggerimplement.entity.Student;
import com.swaggerimplement.service.StudentService;

@RestController
@RequestMapping("/Coaching")
public class MyController {
	
	@Autowired
	private StudentService studentService; //variable of interface
	
	@GetMapping("/getStudent") //read API
	public List<Student> getCoaching(){
		
		return this.studentService.getStudent();
		
	} 
	
	@PostMapping("/postStudent") //create  API
	public Student addStudent(@RequestBody Student student) {
		
		return this.studentService.addStudent(student);
		
	}
	
	@PutMapping("/putStudent") //update API
	public Student updateStudent(@RequestBody Student student) {
		
		return this.studentService.updateStudent(student);
		
	}
	
	@DeleteMapping("/deleteStudent/{coachingId}") //delete API
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String coachingId) {
		try {
			this.studentService.deleteStudent(Long.parseLong(coachingId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			
		}
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}	
	}


