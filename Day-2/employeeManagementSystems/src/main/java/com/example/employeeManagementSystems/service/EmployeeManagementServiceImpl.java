package com.example.employeeManagementSystems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeManagementSystems.entity.EmployeeDetails;
import com.example.employeeManagementSystems.repository.EmployeeManagementRepository;


@Service
public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    @Autowired
    private EmployeeManagementRepository employeeRepository;

    @Override
    public List<EmployeeDetails> getAllEmployees() {
        return (List<EmployeeDetails>) employeeRepository.findAll();
    }

    @Override
    public EmployeeDetails getEmployeeById(int employeeId) {
        Optional<EmployeeDetails> employeeOptional = employeeRepository.findById(employeeId);
        return employeeOptional.orElse(null);
    }

    @Override
    public EmployeeDetails addEmployee(EmployeeDetails employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeDetails updateEmployee(int employeeId, EmployeeDetails updatedEmployee) {
        if (employeeRepository.existsById(employeeId)) {
            updatedEmployee.setEmployeeId(employeeId);
            return employeeRepository.save(updatedEmployee);
        }
        return null;
    }

    @Override
    public void deleteEmployee(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }


	@Override
	public List<EmployeeDetails> searchEmployeesByName(String employeeName) {
	        return employeeRepository.findByEmployeeName(employeeName);
	    }

	
	}
