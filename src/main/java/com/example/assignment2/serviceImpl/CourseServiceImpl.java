package com.example.assignment2.serviceImpl;

import com.example.assignment2.entity.Course;
import com.example.assignment2.repository.CourseRepo;
import com.example.assignment2.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepo courseRepo;

    public List<Course> getAll(){
        return courseRepo.getAll();
    }

    public Course getById(int id){
        return courseRepo.getById(id);
    }

    public void delete(int id){
        courseRepo.delete(id);
    }

    public void update( int id, Course course){
        courseRepo.update(id, course);
    }
}
