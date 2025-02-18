package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.Employee;

// @Repository is a Spring annotation that
// indicates that the decorated class is a repository.
@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    ArrayList<Employee> findAllEmployee();
}
