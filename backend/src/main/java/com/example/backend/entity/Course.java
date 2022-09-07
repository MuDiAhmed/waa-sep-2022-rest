package com.example.backend.entity;

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
