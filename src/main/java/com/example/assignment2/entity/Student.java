package com.example.assignment2.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Data
public class Student {
    private final int id;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final String major;
    private final double gpa;
    private List<Course> courses = new ArrayList<>();
}
