package com.example.demotestapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demotestapplication.entity.Employee;
import com.example.demotestapplication.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok().body(employeeservice.adds(employee));
    }
    @GetMapping("/getall")
    public ResponseEntity<List<Employee>>getAllProduct(){
        return ResponseEntity.ok().body(employeeservice.getAllEmp());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Employee> getEmpById(@PathVariable int id){
    	return ResponseEntity.ok().body(employeeservice.getById(id));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmp(@PathVariable int id,@RequestBody Employee employee){
       
        return  ResponseEntity.ok().body(this.employeeservice.update(id, employee));
    }
    @DeleteMapping("/delete/{id}")
    public HttpStatus delete(@PathVariable int id){
        this.employeeservice.delete(id);
        return HttpStatus.OK;
    }
}
