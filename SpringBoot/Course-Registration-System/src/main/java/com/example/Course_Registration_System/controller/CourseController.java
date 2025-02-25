package com.example.Course_Registration_System.controller;

import com.example.Course_Registration_System.model.Course;
import com.example.Course_Registration_System.model.CourseRegister;
import com.example.Course_Registration_System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
public class CourseController {

    @Autowired
    CourseService service;

    @GetMapping("/courses")
    public List<Course> getCourse()
    {
        return service.getCourse();
    }

   
}
