package com.example.SimpleSpringBoot;


import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {
    private int rno;
    private String name;
    private String gender;
    private String dept;

}
