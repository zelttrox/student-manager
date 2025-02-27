package com.sms.springboot;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private int courseCode;
    private int creditHours;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName, int courseCode, int creditHours, List<Student> students) {
    }

    // Adds a student to the course
    public void EnrollStudent(Student student) {
        this.students.add(student);
    }

    // Returns the list of enrolled students
    public List<Student> GetEnrolledStudents() {
        return this.students;
    }

    // Getters & setters
    // Course name
    public void setCourseName(String courseName) {this.courseName = courseName;}
    public String getCourseName() {return courseName;}

    // Course code
    public void setCourseCode(int courseCode) {this.courseCode = courseCode;}
    public int getCourseCode() {return courseCode;}

    // Credit hours
    public void setCreditHours(int creditHours) {this.creditHours = creditHours;}
    public int getCreditHours() {return creditHours;}

    // Students list
    public void setStudents(List<Student> students) {this.students = students;}
    public List<Student> getStudents() {return students;}
}