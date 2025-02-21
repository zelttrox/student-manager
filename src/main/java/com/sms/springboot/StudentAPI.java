package com.sms.springboot;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentAPI {
	

    private final String apiBaseUrl = "http://localhost:8080/students"; // Set the base URL here

    private final RestTemplate restTemplate = new RestTemplate();

    public void createStudent(Student student) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Student> requestEntity = new HttpEntity<>(student, headers);

        ResponseEntity<Student> response = restTemplate.postForEntity(apiBaseUrl, requestEntity, Student.class);

        // Handle the response (check status code, etc.)
        if (response.getStatusCode() == HttpStatus.CREATED) {
            System.out.println("Student created successfully: " + response.getBody());
        } else {
            System.err.println("Error creating student: " + response.getStatusCode());
        }
    }
}