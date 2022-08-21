package com.mongodb.mongodb.repository;

import com.mongodb.mongodb.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends MongoRepository<Student,String> {
}
