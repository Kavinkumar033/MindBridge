package com.example.Course_Registration_System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {
     @Id
    private int courseId;
    private String courseName;
    private String trainer;
    private String durationWeeks;
}
