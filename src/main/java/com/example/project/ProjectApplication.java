package com.example.project;

import org.apache.coyote.Response;
import org.springframework.aot.hint.ResourcePatternHint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;
import java.util.List;


@SpringBootApplication
@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@GetMapping
	public Map<String, Object> home() {

        Map<String, Object> response = new HashMap<>();

        response.put("message", "Backend API is running successfully");
        response.put("frontendUrl", "https://java-test-task.netlify.app/");
        response.put("availableEndpoints", List.of(
                "GET /items/all",
                "POST /items/add",
                "GET /items/{id}"
        ));

        return response;
    }

}
