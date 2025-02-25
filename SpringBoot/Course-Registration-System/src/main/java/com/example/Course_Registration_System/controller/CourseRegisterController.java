package com.example.Course_Registration_System.controller;


import com.example.Course_Registration_System.model.CourseRegister;
import com.example.Course_Registration_System.service.CourseRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/get")
public class CourseRegisterController {

    CourseRegisterService courseRegisterService;

    public CourseRegisterController(CourseRegisterService courseRegisterService)
    {
     this.courseRegisterService = courseRegisterService;
    }

//     @Autowired
//    CourseRegisterService courseRegisterService;

     @GetMapping("/enrolled_students")
     public List<CourseRegister> enrolledStudents()
     {
         return courseRegisterService.enrolledStudents();
     }

     @PostMapping("/registration")
    public String addRegisteredStudent(@RequestBody CourseRegister student)
     {
         return courseRegisterService.addStudent(student);
     }
}
