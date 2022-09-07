package com.example.assignment2.service;

import com.example.assignment2.entity.Course;
import com.example.assignment2.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    Student getById(int id);

    void delete(int id);

    void update( int id, Student student);

    List<Student> getByMajor(String major);

    List<Course> getStudentCourses(int id);
}
