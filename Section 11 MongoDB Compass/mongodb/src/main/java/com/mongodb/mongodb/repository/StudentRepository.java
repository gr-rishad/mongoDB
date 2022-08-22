package com.mongodb.mongodb.repository;

import com.mongodb.mongodb.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {


    List<Student> findByName(String name);

    @Query("{\"name\":\"?0\"}")
    List<Student> getByName(String name);

    List<Student> findByNameAndEmail(String name, String email);

    List<Student> findByNameOrEmail(String name, String email);

    // embedded document
    List<Student> findByDepartmentDepartmentName(String deptName);

    // embedded document
    List<Student> findBySubjectsSubjectName(String subName);

    List<Student> findByEmailIsLike(String email);

    List<Student> findByNameStartingWith(String name);

    // when dept. is another collection
    List<Student> findByDepartmentId(String deptId);


}
