package com.example.assignment2.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class CourseDTO {
    private final int id;
    private final String name;
    private final String code;
}
