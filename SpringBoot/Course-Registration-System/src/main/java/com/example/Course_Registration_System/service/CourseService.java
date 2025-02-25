package com.example.Course_Registration_System.service;

import com.example.Course_Registration_System.model.Course;
import com.example.Course_Registration_System.model.CourseRegister;
import com.example.Course_Registration_System.repository.CourseRegistryRepository;
import com.example.Course_Registration_System.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository repository;

//    @Autowired
//    CourseRegistryRepository courseRegistryRepo;

    public List<Course> getCourse() {
       return repository.findAll();
    }

//    public List<CourseRegister> enrolledCourses() {
//        return courseRegistryRepo.findAll();
 //   }
}
