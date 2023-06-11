package com.ajal.tech.controller;

import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping("/health")
    public ResponseEntity health() {
        HashMap<String, Object> health = new HashMap<>();
        health.put("status", "UP");
        return ResponseEntity.ok(health);
    }

}
