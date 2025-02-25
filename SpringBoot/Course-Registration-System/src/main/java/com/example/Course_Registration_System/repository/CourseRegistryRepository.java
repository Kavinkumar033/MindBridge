package com.example.Course_Registration_System.repository;

import com.example.Course_Registration_System.model.CourseRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepository extends JpaRepository<CourseRegister,Integer> {
}
