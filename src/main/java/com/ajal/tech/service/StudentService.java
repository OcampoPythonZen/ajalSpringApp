package com.ajal.tech.service;

import com.ajal.tech.entity.StudentEntity;
import com.ajal.tech.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentEntity createStudent(StudentEntity student) {
        return studentRepository.save(student);
    }
}
