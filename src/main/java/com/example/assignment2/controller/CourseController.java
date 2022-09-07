package com.example.assignment2.controller;

import com.example.assignment2.dto.CourseDTO;
import com.example.assignment2.entity.Course;
import com.example.assignment2.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    public List<CourseDTO> getAll(){
        return courseService.getAll();
    }

    @GetMapping("/{id:[0-9]}")
    public CourseDTO getById(@PathVariable int id){
        return courseService.getById(id);
    }

    @DeleteMapping("/{id:[0-9]}")
    public void delete(@PathVariable int id){
        courseService.delete(id);
    }

    @PutMapping("/{id:[0-9]}")
    public void update(@PathVariable int id, @RequestBody CourseDTO course){
        courseService.update(id, course);
    }


}
