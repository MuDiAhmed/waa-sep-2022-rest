package com.example.assignment2.repository;

import com.example.assignment2.dataStore.DataStore;
import com.example.assignment2.entity.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CourseRepo {
    private final DataStore dataStore;

    public List<Course> getAll(){
        return dataStore.getCourses();
    }

    public void save(Course Course){
        dataStore.getCourses().add(Course);
    }

    public Course getById(int id){
        return dataStore.getCourses()
                .stream()
                .filter(Course -> Course.getId() == id)
                .findFirst().orElse(null);
    }

    public void update(int id, Course updatedCourse){
        Course foundCourse = dataStore.getCourses()
                .stream()
                .filter(Course -> Course.getId() == id)
                .findFirst().orElse(null);
        int CourseIndex = dataStore.getCourses().indexOf(foundCourse);
        dataStore.getCourses().set(CourseIndex, updatedCourse);
    }

    public void delete(int id){
        Course foundCourse = dataStore.getCourses()
                .stream()
                .filter(Course -> Course.getId() == id)
                .findFirst().orElse(null);
        dataStore.getCourses().remove(foundCourse);
    }
}
