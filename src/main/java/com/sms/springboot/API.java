package com.sms.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class API {

    public API() {
        InitData();
    }

    private static List<Student> studentList;
    private static List<Course> courseList;
    
    public static void InitData() {
        studentList = new ArrayList<>();
        Student tony_tonic = new Student("Tony Tonic", 1, 18);
        studentList.add(tony_tonic);

        courseList = new ArrayList<>();
        Course poo = new Course("POO", 1, 12, studentList);
        courseList.add(poo);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentList;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student newStudent) {
        studentList.add(newStudent);
        System.out.println("Added student: " + newStudent.getName());
        return newStudent;
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseList;
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course newCourse) {
        courseList.add(newCourse);
        System.out.println("Added course: " + newCourse.getCourseName());
        return newCourse;
    }
}
