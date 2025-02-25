package com.example.JPASpringBoot.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    private int rno;
    private String name;
    private String gender;
    private String technology;
}
