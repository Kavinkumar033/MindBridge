package com.example.SimpleSpringBoot.Service;

import com.example.SimpleSpringBoot.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SimpleService {

   List<Student> students = new ArrayList<>(
           Arrays.asList(
                   new Student(1,"Kavin","Male","IT"),
                   new Student(2,"Kumar","Male","CSE")));

    public String welcome() {
        return "Welcome to Learn SpringBoot in Postman";
    }

    public List<Student> getStudent() {
        return students;
    }

    public Student getStudentByRno(int rollNo) {
        boolean contain = false;
        int index=0;
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).getRno() == rollNo)
            {
                index = i;
                contain=true;
                break;
            }
        }
        if(contain!=false)
        {
            return students.get(index);
        }
        else
        {
            return new Student();
        }
    }

    public String addStudent(Student student) {
        boolean contain = false;
        int index=0;
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).getRno() == student.getRno())
            {
                index = i;
                contain=true;
                break;
            }
        }
        if(contain!=true)
        {
            students.add(student);
            return "Successfully Added";
        }
        else
        {
            return "Adding Rno Already Exits";
        }
    }

    public String updateStudent(Student student) {
        boolean contain = false;
        int index=0;
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).getRno() == student.getRno())
            {
                index = i;
                contain=true;
                break;
            }
        }
        if(contain!=false)
        {
            students.set(index,student);
            return "Update Done";
        }
        else
        {
           return "Updating RollNo is not exits";
        }
    }

    public String deleteStudent(int roolNo) {
        boolean found = false;
        int index=0;
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).getRno() == roolNo)
            {
                index=i;
                found=true;
                break;
            }
        }
        if(found!=false)
        {
            students.remove(index);
            return "Deleted Successfully";
        }
        else return "Deleting RollNo is not exits";
    }
}
