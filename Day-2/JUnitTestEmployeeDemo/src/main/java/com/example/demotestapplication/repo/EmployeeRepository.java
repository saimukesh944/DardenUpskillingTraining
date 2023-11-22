package com.example.demotestapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demotestapplication.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
