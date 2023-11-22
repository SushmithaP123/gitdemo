package com.student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.entity.Student;

@org.springframework.stereotype.Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
