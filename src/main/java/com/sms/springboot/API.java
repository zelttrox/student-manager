package com.sms.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class API {

    private List<Student> studentList;

    public void UserService() {

        studentList = new ArrayList<>();

        Student tony_tonic = new Student("Tony Tonic", "001", 18);

        studentList.add(tony_tonic);        
    }

    @GetMapping
    public String getTest() {      
        UserService();
        return ("Name: " + studentList.get(0).getName());
    }
}
