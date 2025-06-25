package com.demo.migration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple health-check endpoint to verify that the Spring Boot application is up
 * and running. Helpful during the early phases of migration while no
 * business-logic endpoints exist yet.
 */
@RestController
public class HealthController {

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("OK");
    }
}
