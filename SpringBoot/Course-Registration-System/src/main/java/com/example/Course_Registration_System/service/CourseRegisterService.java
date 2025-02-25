package com.example.Course_Registration_System.service;

import com.example.Course_Registration_System.model.CourseRegister;
import com.example.Course_Registration_System.repository.CourseRegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRegisterService {
     //Field
    //@Autowired
    //CourseRegistryRepository courseRegistryRepository;

    //Constructor injection
//    public CourseRegisterService(CourseRegistryRepository courseRegistryRepository) {
//        this.courseRegistryRepository=courseRegistryRepository;
//    }

    //Setter Injection and Autowired
    @Autowired
    public void setCourseRegistryRepository(CourseRegistryRepository courseRegistryRepository)
    {
        this.courseRegistryRepository=courseRegistryRepository;
    }

    CourseRegistryRepository courseRegistryRepository;




    public List<CourseRegister> enrolledStudents() {
        return courseRegistryRepository.findAll();
    }

    public String addStudent(CourseRegister student) {
        courseRegistryRepository.save(student);
        return "Congratulation "+student.getName()+" ! Successfully Registered for "+student.getCourseName()+"(Course)";
    }
}
