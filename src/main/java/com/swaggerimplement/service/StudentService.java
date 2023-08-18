package com.swaggerimplement.service;

import java.util.*;

import com.swaggerimplement.entity.Student;

public interface StudentService {
	
	public List<Student> getStudent();
	
	public Student addStudent(Student student);

	public Student updateStudent(Student student);

	public void deleteStudent(long parseLong);
} 