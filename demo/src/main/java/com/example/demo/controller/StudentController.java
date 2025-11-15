package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    // ADD student
    @PostMapping("/add")
    public Student add(@ModelAttribute Student s) {
        return service.addStudent(s);
    }

    // GET all students
    @GetMapping("/all")
    public List<Student> getAll() {
        return service.getAllStudents();
    }
    // GET student by ID
    @GetMapping("/{id}")
    public Student getOne(@PathVariable int id) {
        return service.getStudent(id);
    }
    // DELETE student
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteStudent(id);
        return "Student deleted";
    }
}
