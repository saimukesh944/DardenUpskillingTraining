package com.example.employeeManagementSystems.service;

import java.util.List;

import com.example.employeeManagementSystems.entity.EmployeeDetails;



public interface  EmployeeManagementService {
	
	List<EmployeeDetails> getAllEmployees();

    EmployeeDetails getEmployeeById(int employeeId);

    EmployeeDetails addEmployee(EmployeeDetails employee);

    EmployeeDetails updateEmployee(int employeeId, EmployeeDetails employee);

    void deleteEmployee(int employeeId);
	
	List<EmployeeDetails> searchEmployeesByName(String employeeName);


}
