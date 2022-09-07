package com.example.assignment2.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class StudentDTO {
    private final int id;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final String major;
    private final double gpa;
}
