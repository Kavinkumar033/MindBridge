package com.example.JPASpringBoot.Service;

import com.example.JPASpringBoot.Model.Student;
import com.example.JPASpringBoot.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String info() {
        return "Learning JPA in SpringBoot using POSTMAN";
    }

    public List<Student> getSudent() {
        return studentRepository.findAll();
    }


    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudentByRno(int rollNo) {
        return studentRepository.findById(rollNo).orElse(new Student());
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }


    public void deleteStudent(int rno) {
        studentRepository.deleteById(rno);

    }

    public void clearStudent() {
        studentRepository.deleteAll();
    }
}
