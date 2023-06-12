package com.ajal.tech.service;

import com.ajal.tech.entity.RatingEntity;
import com.ajal.tech.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {

    @Autowired
    RatingRepository ratingRepository;

    public RatingEntity createRating(RatingEntity rating) {
        return ratingRepository.save(rating);
    }
}
