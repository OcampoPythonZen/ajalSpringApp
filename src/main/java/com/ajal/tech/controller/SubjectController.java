package com.ajal.tech.controller;

import com.ajal.tech.entity.SubjectEntity;
import com.ajal.tech.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping
    SubjectEntity createSubject(@RequestBody SubjectEntity subject) {
        return subjectService.createSubject(subject);
    }
}
