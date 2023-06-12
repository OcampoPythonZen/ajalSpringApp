package com.ajal.tech.service;

import com.ajal.tech.entity.SubjectEntity;
import com.ajal.tech.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public SubjectEntity createSubject(SubjectEntity subject) {
        return subjectRepository.save(subject);
    }
}
