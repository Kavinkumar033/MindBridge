package com.example.JPASpringBoot.Repository;

import com.example.JPASpringBoot.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
