package com.example.assignment2.service;

import com.example.assignment2.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAll();

    Course getById(int id);

    void delete(int id);

    void update( int id, Course course);
}
