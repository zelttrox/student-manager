package com.sms.springboot;

import java.util.ArrayList;
import java.util.List;

public class Student {
    
    private String name; // Name of the student
    private String studentID; // ID of the student
    private int age; // Age of the student
    private List<Float> grades = new ArrayList<>(); // List of grades

    public Student(String name, String id, int age) {
        this.name = name;
        this.studentID = id;
        this.age = age;
    }

    // Add a grade to the student's grade list
    public void AddGrade(float grade) {
        this.grades.add(grade);
    }

    // Get the average of the student's grades
    public float GetAverageGrade() {
        float allGrades = 0;
        for (Float grade : this.grades) {
            allGrades += grade;
          }
        return allGrades / this.grades.size();
    }

    // Getters & setters
    // Student name
    public void setName(String name) {this.name = name;}
    public String getName() { return name;}

    // Student ID
    public void setStudentID(String studentID) {this.studentID = studentID;}
    public String getStudentID() { return studentID;}

    // Student age
    public void setAge(int age) {this.age = age;}
    public int getAge() {return age;}

    // Student grades list
    public void setGrades(List<Float> grades) {this.grades = grades;}
    public List<Float> getGrades() {return grades;}

}
