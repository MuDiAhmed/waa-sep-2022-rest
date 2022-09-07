package com.example.assignment2.serviceImpl;

import com.example.assignment2.entity.Course;
import com.example.assignment2.entity.Student;
import com.example.assignment2.repository.StudentRepo;
import com.example.assignment2.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public List<Student> getAll() {
        return studentRepo.getAll();
    }

    @Override
    public Student getById(int id) {
        return studentRepo.getById(id);
    }

    @Override
    public void delete(int id) {
        studentRepo.delete(id);
    }

    @Override
    public void update(int id, Student student) {
        studentRepo.update(id, student);
    }

    @Override
    public List<Student> getByMajor(String major) {
        return studentRepo.getByMajor(major);
    }

    @Override
    public List<Course> getStudentCourses(int id) {
        return studentRepo.getStudentCourses(id);
    }

}
