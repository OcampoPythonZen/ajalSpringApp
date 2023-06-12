package com.ajal.tech.controller;

import com.ajal.tech.entity.StudentEntity;
import com.ajal.tech.route.ControllerRoute;
import com.ajal.tech.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    StudentEntity createStudent(@RequestBody StudentEntity student){
        return studentService.createStudent(student);
    }
}
