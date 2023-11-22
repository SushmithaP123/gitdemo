package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
@Service
public class ServiceImp implements StudentService{

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addstudent(Student student) {
		studentRepository.save(student);
		return student;
	}

	@Override
	public List<Student> allstudent() {
		List<Student> allstudents = studentRepository.findAll();
		return allstudents;
	}

}
