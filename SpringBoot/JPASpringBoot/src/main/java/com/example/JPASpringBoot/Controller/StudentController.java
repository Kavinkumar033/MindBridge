package com.example.JPASpringBoot.Controller;

import com.example.JPASpringBoot.Model.Student;
import com.example.JPASpringBoot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/")
    public String info()
    {
        return service.info();
    }

    @GetMapping("/student")
    public List<Student> getStudent()
    {
        return service.getSudent();
    }

     @GetMapping("/student/{rno}")
     public  Student getStudentById(@PathVariable("rno") int rollNo)
     {
        return service.getStudentByRno(rollNo);
     }
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student)
    {
        service.addStudent(student);
        return "Added Successfully";
    }

    @PutMapping("/student")
    public String updateStudent(@RequestBody Student student)
    {
        service.updateStudent(student);
        return "Updated Successfully";
    }

    @DeleteMapping("/student/{rno}")
    public String deleteStudent(@PathVariable int rno)
    {
         service.deleteStudent(rno);
         return "Deleted Successfully";
    }

    @DeleteMapping("/student/clear")
    public String clearStudent()
    {
        service.clearStudent();
        return "Student Data Cleared Successfully";
    }
}
