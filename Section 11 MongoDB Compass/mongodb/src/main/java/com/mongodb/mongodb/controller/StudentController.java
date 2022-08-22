package com.mongodb.mongodb.controller;

import com.mongodb.mongodb.entity.Student;
import com.mongodb.mongodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {


    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/getById/{id}")
    public Optional<Student> getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/studentsByName/{name}")
    public List<Student> studentsByName(@PathVariable String name) {
        return studentService.findByName(name);
    }

    @GetMapping("/studentsByNameAndEmail")
    public List<Student> findStudentsByNameAndEmail(@RequestParam String name, @RequestParam String email) {
        return studentService.findByNameAndEmail(name, email);
    }

    @GetMapping("/studentsByNameOrEmail")
    public List<Student> findStudentsByNameOrEmail(@RequestParam String name, @RequestParam String email) {
        return studentService.findByNameOrEmail(name, email);
    }

    @GetMapping("/allWithPagination")
    public List<Student> getAllWithPagination(@RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
                                              @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize,
                                              @RequestParam(value = "sortBy", defaultValue = "id", required = false) String sortBy,
                                              @RequestParam(value = "sortDir", defaultValue = "asc", required = false) String sortDir
    ) {
        return studentService.getAllWithPaginationAndSorting(pageNo, pageSize, sortBy, sortDir);
    }

    @GetMapping("/byDepartmentName")
    public List<Student> byDepartmentName(@RequestParam String deptName) {
        return studentService.byDepartmentName(deptName);
    }

    @GetMapping("/bySubjectName")
    public List<Student> bySubjectName(@RequestParam String subjectName) {
        return studentService.bySubjectName(subjectName);
    }

    @GetMapping("/byEmailLike")
    public List<Student> byEmailLike(@RequestParam String email) {
        return studentService.byEmailLike(email);
    }

    @GetMapping("/startsWith")
    public List<Student> byStartsWith(@RequestParam String name) {
        return studentService.byNameStartsWith(name);
    }

    @GetMapping("/byDepartmentId")
    public List<Student> byDepartmentId(@RequestParam String deptId) {
        return studentService.byDepartmentId(deptId);
    }

}
