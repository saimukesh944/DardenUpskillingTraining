package com.example.employeeManagementSystems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeManagementSystems.entity.EmployeeDetails;
import com.example.employeeManagementSystems.service.EmployeeManagementService;

@RestController
public class EmployeeManagementController {
	  @Autowired
	    private EmployeeManagementService employeeService;

	    @GetMapping("/getAll")
	    public List<EmployeeDetails> getAllEmployees() {
	        return employeeService.getAllEmployees();
	    }

	    @GetMapping("/{employeeId}")
	    public EmployeeDetails getEmployeeById(@PathVariable int employeeId) {
	        return employeeService.getEmployeeById(employeeId);
	    }

	    @PostMapping("/add")
	    public EmployeeDetails addEmployee(@RequestBody EmployeeDetails employee) {
	        return employeeService.addEmployee(employee);
	    }

	    @PutMapping("/{employeeId}")
	    public EmployeeDetails updateEmployee(@PathVariable int employeeId, @RequestBody EmployeeDetails employee) {
	        return employeeService.updateEmployee(employeeId, employee);
	    }

	    @DeleteMapping("/{employeeId}")
	    public void deleteEmployee(@PathVariable int employeeId) {
	        employeeService.deleteEmployee(employeeId);
	    }
		
	
	 @GetMapping("/search/{employeeName}")
	    public List<EmployeeDetails> searchEmployeesByName(@PathVariable String employeeName) {
	        return employeeService.searchEmployeesByName(employeeName);
	    }

}
