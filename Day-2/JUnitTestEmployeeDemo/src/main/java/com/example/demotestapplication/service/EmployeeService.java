package com.example.demotestapplication.service;

import java.util.List;

import com.example.demotestapplication.entity.Employee;

public interface EmployeeService {
	
	public Employee adds(Employee employee);
	public List<Employee> getAllEmp();
	public Employee getById(int id);
	public Employee update(int id,Employee employee);
	public void delete(int id);
	
	
	
	

}
