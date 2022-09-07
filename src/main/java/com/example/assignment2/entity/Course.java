package com.example.assignment2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Data
public class Course {
    private final int id;
    private final String name;
    private final String code;
    private List<Student> students = new ArrayList<>();
}
