package com.example.assignment2.service;

import com.example.assignment2.dto.CourseDTO;
import com.example.assignment2.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> getAll();

    StudentDTO getById(int id);

    void delete(int id);

    void update( int id, StudentDTO student);

    List<StudentDTO> getByMajor(String major);

    List<CourseDTO> getStudentCourses(int id);
}
