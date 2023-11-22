package com.example.demotestapplication.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demotestapplication.entity.Employee;
import com.example.demotestapplication.repo.EmployeeRepository;

@Service
@Transactional
public  class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepo;

	@Override
	public Employee adds(Employee employee) {
		
		return this.employeerepo.save(employee);
		
		
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return this.employeerepo.findAll();
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> employeedb=employeerepo.findById(id);
		if(employeedb.isPresent()) {
			return employeedb.get();
			
	}
		else {
			return null;
		}
	
	}

	@Override
	public Employee update(int id, Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> employeedb=this.employeerepo.findById( employee.getId());
        if (employeedb.isPresent()){
            Employee employeeupdate=employeedb.get();
            employeeupdate.setId( employee.getId());
            employeeupdate.setFirstname(employee.getFirstname());
            employeeupdate.setLastname(employee.getLastname());
            employeeupdate.setRole(employee.getRole());
            employeerepo.save(employeeupdate);
            return employeeupdate;
        }
        else {
            return null;
        }

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> employeedb=this.employeerepo.findById(id);
		if(employeedb.isPresent()) {
			this.employeerepo.delete(employeedb.get());
		}
		
	}

	
	    
		
	
	

	

	


}
