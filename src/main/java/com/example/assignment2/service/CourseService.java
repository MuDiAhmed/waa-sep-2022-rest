package com.example.assignment2.service;

import com.example.assignment2.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    List<CourseDTO> getAll();

    CourseDTO getById(int id);

    void delete(int id);

    void update( int id, CourseDTO course);
}
