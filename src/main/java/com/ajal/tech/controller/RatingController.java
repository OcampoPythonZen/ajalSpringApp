package com.ajal.tech.controller;

import com.ajal.tech.entity.RatingEntity;
import com.ajal.tech.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public RatingEntity createRating(@RequestBody RatingEntity body){
        return ratingService.createRatingByStudent(body);
    }

}
