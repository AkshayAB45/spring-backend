package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student addStudent(Student s) {
        return repo.save(s);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudent(int id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteStudent(int id) {
        repo.deleteById(id);
    }
}
