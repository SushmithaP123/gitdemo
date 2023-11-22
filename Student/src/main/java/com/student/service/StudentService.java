package com.student.service;

import java.util.List;

import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.student.entity.Student;

@Service
public interface StudentService {

	public Student addstudent(Student student);

	public List<Student> allstudent();
	

	
	}


