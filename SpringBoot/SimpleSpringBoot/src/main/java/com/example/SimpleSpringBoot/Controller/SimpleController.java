package com.example.SimpleSpringBoot.Controller;

import com.example.SimpleSpringBoot.Service.SimpleService;
import com.example.SimpleSpringBoot.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SimpleController {

    @Autowired
    SimpleService simpleService;

    @GetMapping("/")
    String show() {
       return simpleService.welcome(); }

    @GetMapping("/student")
    public List<Student> getStudent()
    {
       return simpleService.getStudent();
    }

    @GetMapping("student/{rno}")
    public Student getStudentByRno(@PathVariable("rno") int rollNo)
    {
       return simpleService.getStudentByRno(rollNo);
    }

    @PostMapping("/student")
    public String addStudent(@RequestBody Student student)
    {
       return simpleService.addStudent(student);

    }

    @PutMapping("/student")
    public String updateStudeent(@RequestBody  Student student)
    {
        return simpleService.updateStudent(student);
    }

    @DeleteMapping("/student/{rno}")
    public String deleteStudent(@PathVariable("rno") int roolNo)
    {
        return simpleService.deleteStudent(roolNo);
    }
}
