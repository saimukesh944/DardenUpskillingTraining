package com.example.employeeManagementSystems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeManagementSystems.entity.EmployeeDetails;



@Repository
public interface EmployeeManagementRepository extends JpaRepository<EmployeeDetails, Integer>{
    List<EmployeeDetails> findByEmployeeName(String employeeName);
}